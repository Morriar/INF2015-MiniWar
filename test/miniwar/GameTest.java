/*
 * Copyright 2013 Alexandre Terrasa <alexandre@moz-code.org>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package miniwar;

import miniwar.exceptions.PlayerNotInGameException;
import static org.junit.Assert.*;
import org.junit.*;

public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        this.game = new Game(10);
    }

    /**
     * Test of addPlayer method, of class Game.
     */
    @Test
    public void testAddPlayer() {
        System.out.println("addPlayer");
        Player player = new Player("A");
        game.addPlayer(player);
        assertTrue(game.players.containsValue(player));
    }

    /**
     * Test of playerInGame method, of class Game.
     */
    @Test
    public void testPlayerInGame() {
        System.out.println("playerInGame");
        String name = "A";
        Player player = new Player(name);
        game.addPlayer(player);
        Boolean result = game.isPlayerInGame(name);
        assertTrue(result);
        result = game.isPlayerInGame("Toto");
        assertFalse(result);
    }

    /**
     * Test of getPlayerByName method, of class Game.
     */
    @Test(expected = PlayerNotInGameException.class)
    public void testGetPlayerByName() throws PlayerNotInGameException {
        System.out.println("getPlayerByName");
        String name = "A";
        Player player = new Player(name);
        game.addPlayer(player);
        Player result = game.getPlayerByName(name);
        assertSame(player, result);
        game.getPlayerByName("Toto");
    }
}

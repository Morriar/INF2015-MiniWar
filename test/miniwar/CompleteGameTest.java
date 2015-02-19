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

import miniwar.exceptions.NotEnoughPlayersException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompleteGameTest {

    private Game game;

    @Before
    public void setUp() {
        this.game = new Game(10);
    }

    @After
    public void tearDown() {
        this.game.resetGame();
    }

    /**
     * Try to start game with 0 players.
     */
    @Test(expected = NotEnoughPlayersException.class)
    public void testGame0Players() throws NotEnoughPlayersException {
        System.out.println("startGame");
        game.startGame();
    }

    /**
     * Try to start game with 1 players.
     */
    @Test(expected = NotEnoughPlayersException.class)
    public void testGame1Players() throws NotEnoughPlayersException {
        System.out.println("startGame");
        game.addPlayer(new Player("P1"));
        game.startGame();
    }

    /**
     * Test a 2 player game.
     */
    @Test(timeout=100)
    public void testGame2Players() throws NotEnoughPlayersException {
        System.out.println("startGame");
        game.addPlayer(new Player("P1"));
        game.addPlayer(new Player("P2"));
        game.startGame();
    }

    /**
     * Test a 3 player game.
     */
    @Test(timeout=100)
    public void testGame3Players() throws NotEnoughPlayersException {
        System.out.println("startGame");
        game.addPlayer(new Player("P1"));
        game.addPlayer(new Player("P2"));
        game.addPlayer(new Player("P3"));
        game.startGame();
    }
}

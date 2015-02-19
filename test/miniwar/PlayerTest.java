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

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

public class PlayerTest {

    /**
     * Test of attack method, of class Player.
     */
    @Test
    public void testAttack() {
        System.out.println("attack");
        Player player = new Player("A");
        Player instance = new Player("B");
        Integer lifeBefore = player.life;
        instance.attack(player);
        Integer expected = lifeBefore - instance.force * instance.dps;
        assertEquals(expected, player.life);
    }

    /**
     * Test of hurt method, of class Player.
     */
    @Test
    public void testHurt() {
        System.out.println("hurt");
        Integer damage = 50;
        Player instance = new Player("A");
        Integer lifeBefore = instance.life;
        instance.hurt(damage);
        Integer expected = lifeBefore - damage;
        assertEquals(expected, instance.life);
    }

    /**
     * Test of isDead method, of class Player.
     */
    @Test
    public void testIsDead() {
        System.out.println("isDead");
        Player instance = new Player("test");
        instance.hurt(instance.life);
        Boolean result = instance.isDead();
        assertTrue(result);

        instance = new Player("test");
        result = instance.isDead();
        assertFalse(result);
    }

    /**
     * @FIXME what was the meaning of this test ?
     */
    @Ignore
    public void testPlayerEquality() {
        System.out.println("playerEquality");
        Player p1 = new Player("A");
        Player p2 = new Player("A");
        assertNotSame(p1, p2);
    }
}

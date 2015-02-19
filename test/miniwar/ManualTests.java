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

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Launch some tests manually
 */
public class ManualTests {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CompleteGameTest.class);
        if(result.getFailureCount() > 0) {
            for(Failure failure: result.getFailures()) {
                System.out.println(failure.toString());
            }
        } else {
            System.out.println("No error found.");
        }
    }
}

/*
 * Copyright 2012 Yusuke Yamamoto
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
package ikemen;

import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class MainTest {

    @RunWith(Theories.class)
    public static class WhenValidParam{
        @DataPoints
        public static String[] PARAMS = {
                "イケメン",
                "イケメソ",
                "イクメン",
                "イクメソ",
                "ｲｹﾒﾝ",
                "ｲｹﾒｿ",
                "ｲｸﾒﾝ",
                "ｲｸﾒｿ",
                "ィけメｿ",
                "ィヶめｿ",
                "ヒヶめｿ",
                "ヒゲめｿ",
                "ヒゲメン",
                "い・く・め・ん",
        };

        @Theory
        public void shouldReturnTrue(String param){
            assertThat(Main.yonda(param), is(true));
        }
    }

    @RunWith(Theories.class)
    public static class WhenInvalidParam{
        @DataPoints
        public static String[] PARAMS = {
                "あくめん",
                "生めん",
        };

        @Theory
        public void shouldReturnFalse(String param){
            assertThat(Main.yonda(param), is(false));
        }
    }
}

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

public class MainTest extends junit.framework.TestCase {
    public void testMain() throws Exception {
        assertTrue(Main.yonda("イケメン"));
        assertTrue(Main.yonda("イケメソ"));
        assertTrue(Main.yonda("イクメン"));
        assertTrue(Main.yonda("イクメソ"));
        assertTrue(Main.yonda("ｲｹﾒﾝ"));
        assertTrue(Main.yonda("ｲｹﾒｿ"));
        assertTrue(Main.yonda("ｲｸﾒﾝ"));
        assertTrue(Main.yonda("ｲｸﾒｿ"));
        assertTrue(Main.yonda("ィけメｿ"));
        assertTrue(Main.yonda("ィヶめｿ"));
        assertTrue(Main.yonda("ヒヶめｿ"));
        assertTrue(Main.yonda("ヒゲめｿ"));
        assertTrue(Main.yonda("ヒゲメン"));
        assertTrue(Main.yonda("い・く・め・ん"));
        assertFalse(Main.yonda("あくめん"));
        assertFalse(Main.yonda("生めん"));
    }
}

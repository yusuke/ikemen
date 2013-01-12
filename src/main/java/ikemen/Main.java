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

import twitter4j.*;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final Twitter twitter = TwitterFactory.getSingleton();
        final TwitterStream stream = TwitterStreamFactory.getSingleton();
        stream.addListener(new UserStreamAdapter() {
            public void onStatus(Status status) {
                if (yonda(status.getText())) {
                    try {
                        twitter.createFavorite(status.getId());
                    } catch (TwitterException ignore) {
                    }
                    try {
                        twitter.sendDirectMessage("yusuke", "http://twitter.com/yusuke/status/"+status.getId());
                    } catch (TwitterException ignore) {
                    }
                }
            }
        });
        stream.user();
    }
    final static Pattern pattern = Pattern.compile(".*(ヒ|ﾋ|ひ|ィ|ｨ|イ|ｲ|い).?(ゲ|ｹﾞ|ク|ケ|ｸ|ｹ|ヶ|け|く).?(メ|ﾒ|め).?(ン|ソ|ﾝ|ｿ|ん).*");
    static boolean yonda(String text){
        return pattern.matcher(text).matches();
    }
}

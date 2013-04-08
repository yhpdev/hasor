/*
 * Copyright 2008-2009 the original author or authors.
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
package org.test.more.core.xml;
import java.io.IOException;
import javax.xml.stream.XMLStreamException;
import org.junit.Test;
import org.more.core.xml.XmlNamespaceParser;
import org.more.core.xml.XmlParserKitManager;
import org.more.core.xml.XmlStackDecorator;
import org.more.core.xml.stream.XmlReader;
import org.more.core.xml.stream.XmlStreamEvent;
import org.more.util.ResourcesUtil;
/**
 *
 * @version 2010-9-8
 * @author ������ (zyc@byshell.org)
 */
public class Level2_Test {
    @Test
    public void reader() throws XMLStreamException, IOException {
        XmlReader reader = new XmlReader(ResourcesUtil.getResourceAsStream("org/test/more/core/xml/level_2.xml"));
        //reader.setIgnoreComment(true);
        //reader.setIgnoreSpace(true);
        XmlParserKitManager manager = new XmlParserKitManager();
        //manager.regeditKit("http://www.test.org/schema/beans", new XmlParserKit());
        //manager.regeditKit("http://www.test.org/schema/config", new XmlParserKit());
        manager.regeditKit("http://project.xdf.cn/safety", new XmlNSP("S"));
        manager.regeditKit("http://www.test.org/schema/config", new XmlNSP("C"));
        //http://www.test.org/schema/config
        reader.reader(manager, null);//"/beans/config:config");
    }
}
class XmlNSP implements XmlNamespaceParser {
    private String marker = null;
    public XmlNSP(String string) {
        this.marker = string + " ";
    }
    public void beginAccept() {
        System.out.println(marker + "begin....");
    }
    public void endAccept() {
        System.out.println(marker + "end!");
    }
    public void sendEvent(XmlStackDecorator<Object> context, String xpath, XmlStreamEvent event) throws IOException, XMLStreamException {
        System.out.println(marker + context.getDepth() + "\t" + event.getClass().getSimpleName() + "\t" + xpath);
    }
}
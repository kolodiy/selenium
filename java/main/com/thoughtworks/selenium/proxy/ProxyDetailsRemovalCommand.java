package com.thoughtworks.selenium.proxy;

import com.thoughtworks.selenium.utils.Assert;

/*
  Copyright 2004 ThoughtWorks, Inc. 
  
  Licensed under the Apache License, Version 2.0 (the "License"); 
  you may not use this file except in compliance with the License. 
  You may obtain a copy of the License at 
  
      http://www.apache.org/licenses/LICENSE-2.0 
  
  Unless required by applicable law or agreed to in writing, software 
  distributed under the License is distributed on an "AS IS" BASIS, 
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
  See the License for the specific language governing permissions and 
  limitations under the License. 
*/

/**
 * @version $Id: ProxyDetailsRemovalCommand.java,v 1.1 2004/11/11 12:19:47 mikemelia Exp $
 */
public class ProxyDetailsRemovalCommand implements RequestModificationCommand {
    private static final String REGEX = HTTPRequest.SELENIUM_REDIRECT_SERVER + HTTPRequest.SELENIUM_REDIRECT_DIR;

    public void execute(HTTPRequest httpRequest) {
        Assert.assertIsTrue(httpRequest != null, "httpRequest can't be null");
        
        String uri = httpRequest.getUri();
        httpRequest.setUri(uri.replaceFirst(REGEX, ""));
    }
}

/*
* Copyright 2011 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package groovyx.javafx.factory

/**
*
* @author jimclarke
*/
class NodeFactory extends AbstractNodeFactory {
    public NodeFactory(Class beanClass) {
        super(beanClass)
    }
    public NodeFactory(Class beanClass, boolean leaf) {
        super(beanClass, leaf)
    }
    
    public static def attributeDelegate = { FactoryBuilderSupport builder, def node, def attributes ->
        FXHelper.fxAttributes(node, attributes);
    }
}

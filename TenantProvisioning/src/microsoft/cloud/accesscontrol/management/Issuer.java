/**
 * Copyright 2005-2010 Noelios Technologies.
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL 1.0 (the
 * "Licenses"). You can select the license that you prefer but you may not use
 * this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0.html
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1.php
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1.php
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://www.noelios.com/products/restlet-engine
 * 
 * Restlet is a registered trademark of Noelios Technologies.
 */

package microsoft.cloud.accesscontrol.management;


import java.util.List;

import microsoft.cloud.accesscontrol.management.ConditionalRule;
import microsoft.cloud.accesscontrol.management.IdentityProvider;
import microsoft.cloud.accesscontrol.management.Rule;


/**
* Generated by the generator tool for the OData extension for the Restlet framework.<br>
*
* @see <a href="https://cloudninjajava.accesscontrol.windows.net/v2/mgmt/service/$metadata">Metadata of the target OData service</a>
*
*/
public class Issuer {

    private long id;
    private String name;
    private boolean systemReserved;
    private byte[] version;
    private List<ConditionalRule> conditionalRules;
    private List<IdentityProvider> identityProviders;
    private List<Rule> rules;

    /**
     * Constructor without parameter.
     * 
     */
    public Issuer() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public Issuer(long id) {
        this();
        this.id = id;
    }

   /**
    * Returns the value of the "id" attribute.
    *
    * @return The value of the "id" attribute.
    */
   public long getId() {
      return id;
   }
   /**
    * Returns the value of the "name" attribute.
    *
    * @return The value of the "name" attribute.
    */
   public String getName() {
      return name;
   }
   /**
    * Returns the value of the "systemReserved" attribute.
    *
    * @return The value of the "systemReserved" attribute.
    */
   public boolean getSystemReserved() {
      return systemReserved;
   }
   /**
    * Returns the value of the "version" attribute.
    *
    * @return The value of the "version" attribute.
    */
   public byte[] getVersion() {
      return version;
   }
   /**
    * Returns the value of the "conditionalRules" attribute.
    *
    * @return The value of the "conditionalRules" attribute.
    */
   public List<ConditionalRule> getConditionalRules() {
      return conditionalRules;
   }
   
   /**
    * Returns the value of the "identityProviders" attribute.
    *
    * @return The value of the "identityProviders" attribute.
    */
   public List<IdentityProvider> getIdentityProviders() {
      return identityProviders;
   }
   
   /**
    * Returns the value of the "rules" attribute.
    *
    * @return The value of the "rules" attribute.
    */
   public List<Rule> getRules() {
      return rules;
   }
   
   /**
    * Sets the value of the "id" attribute.
    *
    * @param id
    *     The value of the "id" attribute.
    */
   public void setId(long id) {
      this.id = id;
   }
   /**
    * Sets the value of the "name" attribute.
    *
    * @param name
    *     The value of the "name" attribute.
    */
   public void setName(String name) {
      this.name = name;
   }
   /**
    * Sets the value of the "systemReserved" attribute.
    *
    * @param systemReserved
    *     The value of the "systemReserved" attribute.
    */
   public void setSystemReserved(boolean systemReserved) {
      this.systemReserved = systemReserved;
   }
   /**
    * Sets the value of the "version" attribute.
    *
    * @param version
    *     The value of the "version" attribute.
    */
   public void setVersion(byte[] version) {
      this.version = version;
   }
   /**
    * Sets the value of the "conditionalRules" attribute.
    *
    * @param conditionalRules"
    *     The value of the "conditionalRules" attribute.
    */
   public void setConditionalRules(List<ConditionalRule> conditionalRules) {
      this.conditionalRules = conditionalRules;
   }

   /**
    * Sets the value of the "identityProviders" attribute.
    *
    * @param identityProviders"
    *     The value of the "identityProviders" attribute.
    */
   public void setIdentityProviders(List<IdentityProvider> identityProviders) {
      this.identityProviders = identityProviders;
   }

   /**
    * Sets the value of the "rules" attribute.
    *
    * @param rules"
    *     The value of the "rules" attribute.
    */
   public void setRules(List<Rule> rules) {
      this.rules = rules;
   }

}
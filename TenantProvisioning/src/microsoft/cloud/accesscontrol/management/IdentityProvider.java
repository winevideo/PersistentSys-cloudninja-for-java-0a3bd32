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

import microsoft.cloud.accesscontrol.management.IdentityProviderAddress;
import microsoft.cloud.accesscontrol.management.IdentityProviderClaimType;
import microsoft.cloud.accesscontrol.management.IdentityProviderKey;
import microsoft.cloud.accesscontrol.management.Issuer;
import microsoft.cloud.accesscontrol.management.RelyingPartyIdentityProvider;


/**
* Generated by the generator tool for the OData extension for the Restlet framework.<br>
*
* @see <a href="https://cloudninjajava.accesscontrol.windows.net/v2/mgmt/service/$metadata">Metadata of the target OData service</a>
*
*/
public class IdentityProvider {

    private String description;
    private String displayName;
    private long id;
    private long issuerId;
    private String loginLinkName;
    private String loginParameters;
    private String realm;
    private boolean systemReserved;
    private byte[] version;
    private String webSsoprotocolType;
    private List<IdentityProviderAddress> identityProviderAddresses;
    private List<IdentityProviderClaimType> identityProviderClaimTypes;
    private List<IdentityProviderKey> identityProviderKeys;
    private Issuer issuer;
    private List<RelyingPartyIdentityProvider> relyingPartyIdentityProviders;

    /**
     * Constructor without parameter.
     * 
     */
    public IdentityProvider() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public IdentityProvider(long id) {
        this();
        this.id = id;
    }

   /**
    * Returns the value of the "description" attribute.
    *
    * @return The value of the "description" attribute.
    */
   public String getDescription() {
      return description;
   }
   /**
    * Returns the value of the "displayName" attribute.
    *
    * @return The value of the "displayName" attribute.
    */
   public String getDisplayName() {
      return displayName;
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
    * Returns the value of the "issuerId" attribute.
    *
    * @return The value of the "issuerId" attribute.
    */
   public long getIssuerId() {
      return issuerId;
   }
   /**
    * Returns the value of the "loginLinkName" attribute.
    *
    * @return The value of the "loginLinkName" attribute.
    */
   public String getLoginLinkName() {
      return loginLinkName;
   }
   /**
    * Returns the value of the "loginParameters" attribute.
    *
    * @return The value of the "loginParameters" attribute.
    */
   public String getLoginParameters() {
      return loginParameters;
   }
   /**
    * Returns the value of the "realm" attribute.
    *
    * @return The value of the "realm" attribute.
    */
   public String getRealm() {
      return realm;
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
    * Returns the value of the "webSsoprotocolType" attribute.
    *
    * @return The value of the "webSsoprotocolType" attribute.
    */
   public String getWebSsoprotocolType() {
      return webSsoprotocolType;
   }
   /**
    * Returns the value of the "identityProviderAddresses" attribute.
    *
    * @return The value of the "identityProviderAddresses" attribute.
    */
   public List<IdentityProviderAddress> getIdentityProviderAddresses() {
      return identityProviderAddresses;
   }
   
   /**
    * Returns the value of the "identityProviderClaimTypes" attribute.
    *
    * @return The value of the "identityProviderClaimTypes" attribute.
    */
   public List<IdentityProviderClaimType> getIdentityProviderClaimTypes() {
      return identityProviderClaimTypes;
   }
   
   /**
    * Returns the value of the "identityProviderKeys" attribute.
    *
    * @return The value of the "identityProviderKeys" attribute.
    */
   public List<IdentityProviderKey> getIdentityProviderKeys() {
      return identityProviderKeys;
   }
   
   /**
    * Returns the value of the "issuer" attribute.
    *
    * @return The value of the "issuer" attribute.
    */
   public Issuer getIssuer() {
      return issuer;
   }
   
   /**
    * Returns the value of the "relyingPartyIdentityProviders" attribute.
    *
    * @return The value of the "relyingPartyIdentityProviders" attribute.
    */
   public List<RelyingPartyIdentityProvider> getRelyingPartyIdentityProviders() {
      return relyingPartyIdentityProviders;
   }
   
   /**
    * Sets the value of the "description" attribute.
    *
    * @param description
    *     The value of the "description" attribute.
    */
   public void setDescription(String description) {
      this.description = description;
   }
   /**
    * Sets the value of the "displayName" attribute.
    *
    * @param displayName
    *     The value of the "displayName" attribute.
    */
   public void setDisplayName(String displayName) {
      this.displayName = displayName;
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
    * Sets the value of the "issuerId" attribute.
    *
    * @param issuerId
    *     The value of the "issuerId" attribute.
    */
   public void setIssuerId(long issuerId) {
      this.issuerId = issuerId;
   }
   /**
    * Sets the value of the "loginLinkName" attribute.
    *
    * @param loginLinkName
    *     The value of the "loginLinkName" attribute.
    */
   public void setLoginLinkName(String loginLinkName) {
      this.loginLinkName = loginLinkName;
   }
   /**
    * Sets the value of the "loginParameters" attribute.
    *
    * @param loginParameters
    *     The value of the "loginParameters" attribute.
    */
   public void setLoginParameters(String loginParameters) {
      this.loginParameters = loginParameters;
   }
   /**
    * Sets the value of the "realm" attribute.
    *
    * @param realm
    *     The value of the "realm" attribute.
    */
   public void setRealm(String realm) {
      this.realm = realm;
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
    * Sets the value of the "webSsoprotocolType" attribute.
    *
    * @param webSsoprotocolType
    *     The value of the "webSsoprotocolType" attribute.
    */
   public void setWebSsoprotocolType(String webSsoprotocolType) {
      this.webSsoprotocolType = webSsoprotocolType;
   }
   /**
    * Sets the value of the "identityProviderAddresses" attribute.
    *
    * @param identityProviderAddresses"
    *     The value of the "identityProviderAddresses" attribute.
    */
   public void setIdentityProviderAddresses(List<IdentityProviderAddress> identityProviderAddresses) {
      this.identityProviderAddresses = identityProviderAddresses;
   }

   /**
    * Sets the value of the "identityProviderClaimTypes" attribute.
    *
    * @param identityProviderClaimTypes"
    *     The value of the "identityProviderClaimTypes" attribute.
    */
   public void setIdentityProviderClaimTypes(List<IdentityProviderClaimType> identityProviderClaimTypes) {
      this.identityProviderClaimTypes = identityProviderClaimTypes;
   }

   /**
    * Sets the value of the "identityProviderKeys" attribute.
    *
    * @param identityProviderKeys"
    *     The value of the "identityProviderKeys" attribute.
    */
   public void setIdentityProviderKeys(List<IdentityProviderKey> identityProviderKeys) {
      this.identityProviderKeys = identityProviderKeys;
   }

   /**
    * Sets the value of the "issuer" attribute.
    *
    * @param issuer"
    *     The value of the "issuer" attribute.
    */
   public void setIssuer(Issuer issuer) {
      this.issuer = issuer;
   }

   /**
    * Sets the value of the "relyingPartyIdentityProviders" attribute.
    *
    * @param relyingPartyIdentityProviders"
    *     The value of the "relyingPartyIdentityProviders" attribute.
    */
   public void setRelyingPartyIdentityProviders(List<RelyingPartyIdentityProvider> relyingPartyIdentityProviders) {
      this.relyingPartyIdentityProviders = relyingPartyIdentityProviders;
   }

}
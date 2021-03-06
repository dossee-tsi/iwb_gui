
package WSClient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Login", targetNamespace = "http://users/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Login {


    /**
     * 
     * @param login
     * @param pass
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://users/", className = "WSClient.Login_Type")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://users/", className = "WSClient.LoginResponse")
    @Action(input = "http://users/Login/loginRequest", output = "http://users/Login/loginResponse")
    public String login(
        @WebParam(name = "login", targetNamespace = "")
        String login,
        @WebParam(name = "pass", targetNamespace = "")
        String pass);

}

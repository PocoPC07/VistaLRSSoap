
package sv;

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
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Servicios", targetNamespace = "http://sv/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servicios {


    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "Login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Login", targetNamespace = "http://sv/", className = "sv.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://sv/", className = "sv.LoginResponse")
    @Action(input = "http://sv/Servicios/LoginRequest", output = "http://sv/Servicios/LoginResponse")
    public Boolean login(
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "username", targetNamespace = "")
        String username);

    /**
     * 
     * @param total
     * @param pago
     * @return
     *     returns int
     */
    @WebMethod(operationName = "ProcesarPago")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ProcesarPago", targetNamespace = "http://sv/", className = "sv.ProcesarPago")
    @ResponseWrapper(localName = "ProcesarPagoResponse", targetNamespace = "http://sv/", className = "sv.ProcesarPagoResponse")
    @Action(input = "http://sv/Servicios/ProcesarPagoRequest", output = "http://sv/Servicios/ProcesarPagoResponse")
    public int procesarPago(
        @WebParam(name = "total", targetNamespace = "")
        int total,
        @WebParam(name = "pago", targetNamespace = "")
        int pago);

    /**
     * 
     * @param valor
     * @param username
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarCuenta", targetNamespace = "http://sv/", className = "sv.ActualizarCuenta")
    @ResponseWrapper(localName = "actualizarCuentaResponse", targetNamespace = "http://sv/", className = "sv.ActualizarCuentaResponse")
    @Action(input = "http://sv/Servicios/actualizarCuentaRequest", output = "http://sv/Servicios/actualizarCuentaResponse")
    public Boolean actualizarCuenta(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "valor", targetNamespace = "")
        double valor);

    /**
     * 
     * @param password
     * @param dinero
     * @param username
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registrarse", targetNamespace = "http://sv/", className = "sv.Registrarse")
    @ResponseWrapper(localName = "registrarseResponse", targetNamespace = "http://sv/", className = "sv.RegistrarseResponse")
    @Action(input = "http://sv/Servicios/registrarseRequest", output = "http://sv/Servicios/registrarseResponse")
    public Boolean registrarse(
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "dinero", targetNamespace = "")
        double dinero);

    /**
     * 
     * @param username
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setearSaldo", targetNamespace = "http://sv/", className = "sv.SetearSaldo")
    @ResponseWrapper(localName = "setearSaldoResponse", targetNamespace = "http://sv/", className = "sv.SetearSaldoResponse")
    @Action(input = "http://sv/Servicios/setearSaldoRequest", output = "http://sv/Servicios/setearSaldoResponse")
    public Double setearSaldo(
        @WebParam(name = "username", targetNamespace = "")
        String username);

}

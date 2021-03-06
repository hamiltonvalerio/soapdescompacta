package br.com.soap.wsdl2java;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-01-09T16:04:13.206-03:00
 * Generated source version: 3.5.0
 *
 */
@WebServiceClient(name = "ConsultarParcelaControllerService",
                  wsdlLocation = "file:/C:/Users/h.valerio.filho/eclipse-workspace/descompactadenovo/src/main/resources/ConsultarParcelaController.wsdl",
                  targetNamespace = "http://frontcontroller.apolice")
public class ConsultarParcelaControllerService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://frontcontroller.apolice", "ConsultarParcelaControllerService");
    public final static QName ConsultarParcelaController = new QName("http://frontcontroller.apolice", "ConsultarParcelaController");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/h.valerio.filho/eclipse-workspace/descompactadenovo/src/main/resources/ConsultarParcelaController.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ConsultarParcelaControllerService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/h.valerio.filho/eclipse-workspace/descompactadenovo/src/main/resources/ConsultarParcelaController.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ConsultarParcelaControllerService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ConsultarParcelaControllerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultarParcelaControllerService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ConsultarParcelaControllerService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ConsultarParcelaControllerService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ConsultarParcelaControllerService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ConsultarParcelaController
     */
    @WebEndpoint(name = "ConsultarParcelaController")
    public ConsultarParcelaController getConsultarParcelaController() {
        return super.getPort(ConsultarParcelaController, ConsultarParcelaController.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultarParcelaController
     */
    @WebEndpoint(name = "ConsultarParcelaController")
    public ConsultarParcelaController getConsultarParcelaController(WebServiceFeature... features) {
        return super.getPort(ConsultarParcelaController, ConsultarParcelaController.class, features);
    }

}


/*
 * 
 */

package ocpp.cp._2010._08;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.1
 * Wed Sep 18 16:19:42 CEST 2013
 * Generated source version: 2.3.1
 * 
 */


@WebServiceClient(name = "ChargePointService", 
                  wsdlLocation = "file:/Users/sgokay/git/steve/src/main/webapp/wsdl/chargepointservice.wsdl",
                  targetNamespace = "urn://Ocpp/Cp/2010/08/") 
public class ChargePointService_Service extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("urn://Ocpp/Cp/2010/08/", "ChargePointService");
    public final static QName ChargePointServiceSoap12 = new QName("urn://Ocpp/Cp/2010/08/", "ChargePointServiceSoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/sgokay/git/steve/src/main/webapp/wsdl/chargepointservice.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:/Users/sgokay/git/steve/src/main/webapp/wsdl/chargepointservice.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public ChargePointService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ChargePointService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ChargePointService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ChargePointService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }
    public ChargePointService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ChargePointService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ChargePointService
     */
    @WebEndpoint(name = "ChargePointServiceSoap12")
    public ChargePointService getChargePointServiceSoap12() {
        return super.getPort(ChargePointServiceSoap12, ChargePointService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChargePointService
     */
    @WebEndpoint(name = "ChargePointServiceSoap12")
    public ChargePointService getChargePointServiceSoap12(WebServiceFeature... features) {
        return super.getPort(ChargePointServiceSoap12, ChargePointService.class, features);
    }

}

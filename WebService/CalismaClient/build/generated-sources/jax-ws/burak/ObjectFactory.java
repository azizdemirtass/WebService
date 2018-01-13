
package burak;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the burak package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetInsPic_QNAME = new QName("http://burak/", "GetInsPic");
    private final static QName _GetInsPicResponse_QNAME = new QName("http://burak/", "GetInsPicResponse");
    private final static QName _GetTwitPic_QNAME = new QName("http://burak/", "GetTwitPic");
    private final static QName _GetTwitPicResponse_QNAME = new QName("http://burak/", "GetTwitPicResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: burak
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInsPic }
     * 
     */
    public GetInsPic createGetInsPic() {
        return new GetInsPic();
    }

    /**
     * Create an instance of {@link GetInsPicResponse }
     * 
     */
    public GetInsPicResponse createGetInsPicResponse() {
        return new GetInsPicResponse();
    }

    /**
     * Create an instance of {@link GetTwitPic }
     * 
     */
    public GetTwitPic createGetTwitPic() {
        return new GetTwitPic();
    }

    /**
     * Create an instance of {@link GetTwitPicResponse }
     * 
     */
    public GetTwitPicResponse createGetTwitPicResponse() {
        return new GetTwitPicResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInsPic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://burak/", name = "GetInsPic")
    public JAXBElement<GetInsPic> createGetInsPic(GetInsPic value) {
        return new JAXBElement<GetInsPic>(_GetInsPic_QNAME, GetInsPic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInsPicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://burak/", name = "GetInsPicResponse")
    public JAXBElement<GetInsPicResponse> createGetInsPicResponse(GetInsPicResponse value) {
        return new JAXBElement<GetInsPicResponse>(_GetInsPicResponse_QNAME, GetInsPicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTwitPic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://burak/", name = "GetTwitPic")
    public JAXBElement<GetTwitPic> createGetTwitPic(GetTwitPic value) {
        return new JAXBElement<GetTwitPic>(_GetTwitPic_QNAME, GetTwitPic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTwitPicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://burak/", name = "GetTwitPicResponse")
    public JAXBElement<GetTwitPicResponse> createGetTwitPicResponse(GetTwitPicResponse value) {
        return new JAXBElement<GetTwitPicResponse>(_GetTwitPicResponse_QNAME, GetTwitPicResponse.class, null, value);
    }

}

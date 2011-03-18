
package WSClient.sessions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCapturedImages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCapturedImages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key_frame_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCapturedImages", propOrder = {
    "keyFrameId"
})
public class GetCapturedImages {

    @XmlElement(name = "key_frame_id")
    protected String keyFrameId;

    /**
     * Gets the value of the keyFrameId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyFrameId() {
        return keyFrameId;
    }

    /**
     * Sets the value of the keyFrameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyFrameId(String value) {
        this.keyFrameId = value;
    }

}

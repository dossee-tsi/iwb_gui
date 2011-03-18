
package WSClient.sessions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WSClient.sessions package. 
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

    private final static QName _NewCapturedImage_QNAME = new QName("http://sessions/", "newCapturedImage");
    private final static QName _GetFriendsSessionsResponse_QNAME = new QName("http://sessions/", "getFriendsSessionsResponse");
    private final static QName _DeleteCapturedImageResponse_QNAME = new QName("http://sessions/", "deleteCapturedImageResponse");
    private final static QName _NewKeyFrameResponse_QNAME = new QName("http://sessions/", "newKeyFrameResponse");
    private final static QName _GetKeyFramesResponse_QNAME = new QName("http://sessions/", "getKeyFramesResponse");
    private final static QName _DeleteKeyFrame_QNAME = new QName("http://sessions/", "deleteKeyFrame");
    private final static QName _AddCapturedImageCommentResponse_QNAME = new QName("http://sessions/", "addCapturedImageCommentResponse");
    private final static QName _DeleteKeyFrameResponse_QNAME = new QName("http://sessions/", "deleteKeyFrameResponse");
    private final static QName _GetSessionsResponse_QNAME = new QName("http://sessions/", "getSessionsResponse");
    private final static QName _GetSessions_QNAME = new QName("http://sessions/", "getSessions");
    private final static QName _GetKeyFrames_QNAME = new QName("http://sessions/", "getKeyFrames");
    private final static QName _GetFriendsSessions_QNAME = new QName("http://sessions/", "getFriendsSessions");
    private final static QName _GetOtherSessions_QNAME = new QName("http://sessions/", "getOtherSessions");
    private final static QName _GetCapturedImages_QNAME = new QName("http://sessions/", "getCapturedImages");
    private final static QName _GetOtherSessionsResponse_QNAME = new QName("http://sessions/", "getOtherSessionsResponse");
    private final static QName _NewCapturedImageResponse_QNAME = new QName("http://sessions/", "newCapturedImageResponse");
    private final static QName _AddCapturedImageComment_QNAME = new QName("http://sessions/", "addCapturedImageComment");
    private final static QName _NewSession_QNAME = new QName("http://sessions/", "newSession");
    private final static QName _AddKeyFrameComment_QNAME = new QName("http://sessions/", "addKeyFrameComment");
    private final static QName _GetCapturedImagesResponse_QNAME = new QName("http://sessions/", "getCapturedImagesResponse");
    private final static QName _AddKeyFrameCommentResponse_QNAME = new QName("http://sessions/", "addKeyFrameCommentResponse");
    private final static QName _NewKeyFrame_QNAME = new QName("http://sessions/", "newKeyFrame");
    private final static QName _DeleteCapturedImage_QNAME = new QName("http://sessions/", "deleteCapturedImage");
    private final static QName _NewSessionResponse_QNAME = new QName("http://sessions/", "newSessionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WSClient.sessions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetKeyFrames }
     * 
     */
    public GetKeyFrames createGetKeyFrames() {
        return new GetKeyFrames();
    }

    /**
     * Create an instance of {@link GetCapturedImages }
     * 
     */
    public GetCapturedImages createGetCapturedImages() {
        return new GetCapturedImages();
    }

    /**
     * Create an instance of {@link NewCapturedImageResponse }
     * 
     */
    public NewCapturedImageResponse createNewCapturedImageResponse() {
        return new NewCapturedImageResponse();
    }

    /**
     * Create an instance of {@link GetFriendsSessions }
     * 
     */
    public GetFriendsSessions createGetFriendsSessions() {
        return new GetFriendsSessions();
    }

    /**
     * Create an instance of {@link AddCapturedImageCommentResponse }
     * 
     */
    public AddCapturedImageCommentResponse createAddCapturedImageCommentResponse() {
        return new AddCapturedImageCommentResponse();
    }

    /**
     * Create an instance of {@link DeleteCapturedImageResponse }
     * 
     */
    public DeleteCapturedImageResponse createDeleteCapturedImageResponse() {
        return new DeleteCapturedImageResponse();
    }

    /**
     * Create an instance of {@link GetCapturedImagesResponse }
     * 
     */
    public GetCapturedImagesResponse createGetCapturedImagesResponse() {
        return new GetCapturedImagesResponse();
    }

    /**
     * Create an instance of {@link NewKeyFrame }
     * 
     */
    public NewKeyFrame createNewKeyFrame() {
        return new NewKeyFrame();
    }

    /**
     * Create an instance of {@link AddKeyFrameCommentResponse }
     * 
     */
    public AddKeyFrameCommentResponse createAddKeyFrameCommentResponse() {
        return new AddKeyFrameCommentResponse();
    }

    /**
     * Create an instance of {@link DeleteKeyFrame }
     * 
     */
    public DeleteKeyFrame createDeleteKeyFrame() {
        return new DeleteKeyFrame();
    }

    /**
     * Create an instance of {@link AddCapturedImageComment }
     * 
     */
    public AddCapturedImageComment createAddCapturedImageComment() {
        return new AddCapturedImageComment();
    }

    /**
     * Create an instance of {@link GetSessions }
     * 
     */
    public GetSessions createGetSessions() {
        return new GetSessions();
    }

    /**
     * Create an instance of {@link GetSessionsResponse }
     * 
     */
    public GetSessionsResponse createGetSessionsResponse() {
        return new GetSessionsResponse();
    }

    /**
     * Create an instance of {@link GetOtherSessionsResponse }
     * 
     */
    public GetOtherSessionsResponse createGetOtherSessionsResponse() {
        return new GetOtherSessionsResponse();
    }

    /**
     * Create an instance of {@link AddKeyFrameComment }
     * 
     */
    public AddKeyFrameComment createAddKeyFrameComment() {
        return new AddKeyFrameComment();
    }

    /**
     * Create an instance of {@link NewSessionResponse }
     * 
     */
    public NewSessionResponse createNewSessionResponse() {
        return new NewSessionResponse();
    }

    /**
     * Create an instance of {@link DeleteKeyFrameResponse }
     * 
     */
    public DeleteKeyFrameResponse createDeleteKeyFrameResponse() {
        return new DeleteKeyFrameResponse();
    }

    /**
     * Create an instance of {@link NewSession }
     * 
     */
    public NewSession createNewSession() {
        return new NewSession();
    }

    /**
     * Create an instance of {@link NewCapturedImage }
     * 
     */
    public NewCapturedImage createNewCapturedImage() {
        return new NewCapturedImage();
    }

    /**
     * Create an instance of {@link GetOtherSessions }
     * 
     */
    public GetOtherSessions createGetOtherSessions() {
        return new GetOtherSessions();
    }

    /**
     * Create an instance of {@link DeleteCapturedImage }
     * 
     */
    public DeleteCapturedImage createDeleteCapturedImage() {
        return new DeleteCapturedImage();
    }

    /**
     * Create an instance of {@link GetKeyFramesResponse }
     * 
     */
    public GetKeyFramesResponse createGetKeyFramesResponse() {
        return new GetKeyFramesResponse();
    }

    /**
     * Create an instance of {@link GetFriendsSessionsResponse }
     * 
     */
    public GetFriendsSessionsResponse createGetFriendsSessionsResponse() {
        return new GetFriendsSessionsResponse();
    }

    /**
     * Create an instance of {@link NewKeyFrameResponse }
     * 
     */
    public NewKeyFrameResponse createNewKeyFrameResponse() {
        return new NewKeyFrameResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewCapturedImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "newCapturedImage")
    public JAXBElement<NewCapturedImage> createNewCapturedImage(NewCapturedImage value) {
        return new JAXBElement<NewCapturedImage>(_NewCapturedImage_QNAME, NewCapturedImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFriendsSessionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "getFriendsSessionsResponse")
    public JAXBElement<GetFriendsSessionsResponse> createGetFriendsSessionsResponse(GetFriendsSessionsResponse value) {
        return new JAXBElement<GetFriendsSessionsResponse>(_GetFriendsSessionsResponse_QNAME, GetFriendsSessionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCapturedImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "deleteCapturedImageResponse")
    public JAXBElement<DeleteCapturedImageResponse> createDeleteCapturedImageResponse(DeleteCapturedImageResponse value) {
        return new JAXBElement<DeleteCapturedImageResponse>(_DeleteCapturedImageResponse_QNAME, DeleteCapturedImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewKeyFrameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "newKeyFrameResponse")
    public JAXBElement<NewKeyFrameResponse> createNewKeyFrameResponse(NewKeyFrameResponse value) {
        return new JAXBElement<NewKeyFrameResponse>(_NewKeyFrameResponse_QNAME, NewKeyFrameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKeyFramesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "getKeyFramesResponse")
    public JAXBElement<GetKeyFramesResponse> createGetKeyFramesResponse(GetKeyFramesResponse value) {
        return new JAXBElement<GetKeyFramesResponse>(_GetKeyFramesResponse_QNAME, GetKeyFramesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteKeyFrame }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "deleteKeyFrame")
    public JAXBElement<DeleteKeyFrame> createDeleteKeyFrame(DeleteKeyFrame value) {
        return new JAXBElement<DeleteKeyFrame>(_DeleteKeyFrame_QNAME, DeleteKeyFrame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCapturedImageCommentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "addCapturedImageCommentResponse")
    public JAXBElement<AddCapturedImageCommentResponse> createAddCapturedImageCommentResponse(AddCapturedImageCommentResponse value) {
        return new JAXBElement<AddCapturedImageCommentResponse>(_AddCapturedImageCommentResponse_QNAME, AddCapturedImageCommentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteKeyFrameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "deleteKeyFrameResponse")
    public JAXBElement<DeleteKeyFrameResponse> createDeleteKeyFrameResponse(DeleteKeyFrameResponse value) {
        return new JAXBElement<DeleteKeyFrameResponse>(_DeleteKeyFrameResponse_QNAME, DeleteKeyFrameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSessionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "getSessionsResponse")
    public JAXBElement<GetSessionsResponse> createGetSessionsResponse(GetSessionsResponse value) {
        return new JAXBElement<GetSessionsResponse>(_GetSessionsResponse_QNAME, GetSessionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSessions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "getSessions")
    public JAXBElement<GetSessions> createGetSessions(GetSessions value) {
        return new JAXBElement<GetSessions>(_GetSessions_QNAME, GetSessions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKeyFrames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "getKeyFrames")
    public JAXBElement<GetKeyFrames> createGetKeyFrames(GetKeyFrames value) {
        return new JAXBElement<GetKeyFrames>(_GetKeyFrames_QNAME, GetKeyFrames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFriendsSessions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "getFriendsSessions")
    public JAXBElement<GetFriendsSessions> createGetFriendsSessions(GetFriendsSessions value) {
        return new JAXBElement<GetFriendsSessions>(_GetFriendsSessions_QNAME, GetFriendsSessions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOtherSessions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "getOtherSessions")
    public JAXBElement<GetOtherSessions> createGetOtherSessions(GetOtherSessions value) {
        return new JAXBElement<GetOtherSessions>(_GetOtherSessions_QNAME, GetOtherSessions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCapturedImages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "getCapturedImages")
    public JAXBElement<GetCapturedImages> createGetCapturedImages(GetCapturedImages value) {
        return new JAXBElement<GetCapturedImages>(_GetCapturedImages_QNAME, GetCapturedImages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOtherSessionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "getOtherSessionsResponse")
    public JAXBElement<GetOtherSessionsResponse> createGetOtherSessionsResponse(GetOtherSessionsResponse value) {
        return new JAXBElement<GetOtherSessionsResponse>(_GetOtherSessionsResponse_QNAME, GetOtherSessionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewCapturedImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "newCapturedImageResponse")
    public JAXBElement<NewCapturedImageResponse> createNewCapturedImageResponse(NewCapturedImageResponse value) {
        return new JAXBElement<NewCapturedImageResponse>(_NewCapturedImageResponse_QNAME, NewCapturedImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCapturedImageComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "addCapturedImageComment")
    public JAXBElement<AddCapturedImageComment> createAddCapturedImageComment(AddCapturedImageComment value) {
        return new JAXBElement<AddCapturedImageComment>(_AddCapturedImageComment_QNAME, AddCapturedImageComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "newSession")
    public JAXBElement<NewSession> createNewSession(NewSession value) {
        return new JAXBElement<NewSession>(_NewSession_QNAME, NewSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddKeyFrameComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "addKeyFrameComment")
    public JAXBElement<AddKeyFrameComment> createAddKeyFrameComment(AddKeyFrameComment value) {
        return new JAXBElement<AddKeyFrameComment>(_AddKeyFrameComment_QNAME, AddKeyFrameComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCapturedImagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "getCapturedImagesResponse")
    public JAXBElement<GetCapturedImagesResponse> createGetCapturedImagesResponse(GetCapturedImagesResponse value) {
        return new JAXBElement<GetCapturedImagesResponse>(_GetCapturedImagesResponse_QNAME, GetCapturedImagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddKeyFrameCommentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "addKeyFrameCommentResponse")
    public JAXBElement<AddKeyFrameCommentResponse> createAddKeyFrameCommentResponse(AddKeyFrameCommentResponse value) {
        return new JAXBElement<AddKeyFrameCommentResponse>(_AddKeyFrameCommentResponse_QNAME, AddKeyFrameCommentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewKeyFrame }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "newKeyFrame")
    public JAXBElement<NewKeyFrame> createNewKeyFrame(NewKeyFrame value) {
        return new JAXBElement<NewKeyFrame>(_NewKeyFrame_QNAME, NewKeyFrame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCapturedImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "deleteCapturedImage")
    public JAXBElement<DeleteCapturedImage> createDeleteCapturedImage(DeleteCapturedImage value) {
        return new JAXBElement<DeleteCapturedImage>(_DeleteCapturedImage_QNAME, DeleteCapturedImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewSessionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sessions/", name = "newSessionResponse")
    public JAXBElement<NewSessionResponse> createNewSessionResponse(NewSessionResponse value) {
        return new JAXBElement<NewSessionResponse>(_NewSessionResponse_QNAME, NewSessionResponse.class, null, value);
    }

}

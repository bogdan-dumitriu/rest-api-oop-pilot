package eu.europa.ec.isa2.restapi.profile.annotation;


import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import javax.ws.rs.HttpMethod;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@HttpMethod("POST")
public @interface SubmitMessageOperation {
    String service() default "";
    String action() default "";
    String messageIdParamName() default "messageId";
    boolean sync() default false;

    boolean useSignalWebhook() default false;
    boolean useMessageWebhook() default false;
    String requestTitle() default "";
    String requestDescription() default "";
    MultipartPayload[] requestPayloads()  default {};
    String responseTitle() default "";
    String responseDescription() default "";
    MultipartPayload[] responsePayloads()  default {};

    /**
     * Tags can be used for logical grouping of operations by resources or any other qualifier.
     *
     * @return the list of tags associated with this operation
     **/
    String[] tags() default {};

    /**
     * Provides a brief description of this operation. Should be 120 characters or less for proper visibility in Swagger-UI.
     *
     * @return a summary of this operation
     **/
    String summary() default "";

    /**
     * A verbose description of the operation.
     *
     * @return a description of this operation
     **/
    String description() default "";

    /**
     * Additional external documentation for this operation.
     *
     * @return additional documentation about this operation
     **/
    ExternalDocumentation externalDocs() default @ExternalDocumentation();

    /**
     * The operationId is used by third-party tools to uniquely identify this operation.
     *
     * @return the ID of this operation
     **/
    String operationId() default "";

    SecurityRequirement[] securityRequirements()  default {};



}

package biz.netcentric.security;

public interface Constants {

    String TAINT_STRING_DEFAULT = "tqA42gYx";

    String TRUSTED_TYPES_PAYLOAD = "trusted-types-payload.js";

    String META_CSP_DEFAULT = "<meta http-equiv=content-security-policy content=\"trusted-types default\">\n";

    String TRUSTED_TYPES_FULL = "<script src=\"https://w3c.github.io/webappsec-trusted-types/dist/es5/trustedtypes.build.js\" data-csp=\"trusted-types default;\"></script>\n";

    String INJECTED_SCRIPTS = TRUSTED_TYPES_FULL + "<script>%s</script>\n";
}
package de.ctoffer.commons.wrapper.mail;

import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

public enum MimeMediaType {
    APPLICATION_ATOM_XML("application/atom+xml", ".atom"),
    APPLICATION_DIRECTX("application/directx", ".x"),
    APPLICATION_ENVOY("application/envoy", ".evy"),
    APPLICATION_ETL("application/etl", ".etl"),
    APPLICATION_FRACTALS("application/fractals", ".fif"),
    APPLICATION_FSHARP_SCRIPT("application/fsharp-script", ".fsscript", ".fsx"),
    APPLICATION_FUTURESPLASH("application/futuresplash", ".spl"),
    APPLICATION_HTA("application/hta", ".hta"),
    APPLICATION_INTERNET_PROPERTY_STREAM("application/internet-property-stream", ".acx"),
    APPLICATION_JAVA_ARCHIVE("application/java-archive", ".jar"),
    APPLICATION_JSON("application/json", ".json"),
    APPLICATION_LIQUIDMOTION("application/liquidmotion", ".jck", ".jcz"),
    APPLICATION_MAC_BINHEX40("application/mac-binhex40", ".hqx"),
    APPLICATION_MSACCESS("application/msaccess", ".accdb", ".accde", ".accdt", ".ade", ".adp", ".mda", ".mde"),
    APPLICATION_MSACCESS_ADDIN("application/msaccess.addin", ".accda"),
    APPLICATION_MSACCESS_CAB("application/msaccess.cab", ".accdc"),
    APPLICATION_MSACCESS_FTEMPLATE("application/msaccess.ftemplate", ".accft"),
    APPLICATION_MSACCESS_RUNTIME("application/msaccess.runtime", ".accdr"),
    APPLICATION_MSACCESS_WEBAPPLICATION("application/msaccess.webapplication", ".accdw"),
    APPLICATION_MSWORD("application/msword", ".doc", ".dot", ".wbk", ".wiz"),
    APPLICATION_MS_VSI("application/ms-vsi", ".vsi"),
    APPLICATION_OCTET_STREAM("application/octet-stream", ".aaf", ".aca", ".afm", ".asd", ".asi", ".bin", ".cab", ".chm", ".cur", ".dat", ".deploy", ".dsp", ".dwp", ".emz", ".eot", ".exe", ".fla", ".hhk", ".hhp", ".hxd", ".hxh", ".hxi", ".hxq", ".hxr", ".hxs", ".hxw", ".ics", ".inf", ".java", ".jpb", ".lpk", ".lzh", ".mdp", ".mix", ".msi", ".mso", ".ocx", ".pcx", ".pcz", ".pfb", ".pfm", ".prm", ".prx", ".psd", ".psm", ".psp", ".qxd", ".rar", ".sea", ".smi", ".snp", ".thn", ".toc", ".ttf", ".u32", ".xsn", ".xtp"),
    APPLICATION_ODA("application/oda", ".oda"),
    APPLICATION_OLEOBJECT("application/oleobject", ".ods"),
    APPLICATION_OLESCRIPT("application/olescript", ".axs"),
    APPLICATION_ONENOTE("application/onenote", ".one", ".onea", ".onepkg", ".onetmp", ".onetoc", ".onetoc2"),
    APPLICATION_OPENSEARCHDESCRIPTION_XML("application/opensearchdescription+xml", ".osdx"),
    APPLICATION_PDF("application/pdf", ".pdf"),
    APPLICATION_PICS_RULES("application/pics-rules", ".prf"),
    APPLICATION_PKCS10("application/pkcs10", ".p10"),
    APPLICATION_PKCS7_MIME("application/pkcs7-mime", ".p7c", ".p7m"),
    APPLICATION_PKCS7_SIGNATURE("application/pkcs7-signature", ".p7s"),
    APPLICATION_PKIX_CRL("application/pkix-crl", ".crl"),
    APPLICATION_POSTSCRIPT("application/postscript", ".ai", ".eps", ".ps"),
    APPLICATION_POWERSHELL("application/PowerShell", ".psc1"),
    APPLICATION_RAT_FILE("application/rat-file", ".rat"),
    APPLICATION_RTF("application/rtf", ".rtf"),
    APPLICATION_SDP("application/sdp", ".sdp"),
    APPLICATION_SET_PAYMENT_INITIATION("application/set-payment-initiation", ".setpay"),
    APPLICATION_SET_REGISTRATION_INITIATION("application/set-registration-initiation", ".setreg"),
    APPLICATION_STREAMINGMEDIA("application/streamingmedia", ".ssm"),
    APPLICATION_VND_ADOBE_AIR_APPLICATION_INSTALLER_PACKAGE_ZIP("application/vnd.adobe.air-application-installer-package+zip", ".air"),
    APPLICATION_VND_FDF("application/vnd.fdf", ".fdf"),
    APPLICATION_VND_MS_EXCEL("application/vnd.ms-excel", ".slk", ".xla", ".xlc", ".xld", ".xlk", ".xll", ".xlm", ".xls", ".xlt", ".xlw"),
    APPLICATION_VND_MS_EXCEL_ADDIN_MACROENABLED_12("application/vnd.ms-excel.addin.macroEnabled.12", ".xlam"),
    APPLICATION_VND_MS_EXCEL_SHEET_BINARY_MACROENABLED_12("application/vnd.ms-excel.sheet.binary.macroEnabled.12", ".xlsb"),
    APPLICATION_VND_MS_EXCEL_SHEET_MACROENABLED_12("application/vnd.ms-excel.sheet.macroEnabled.12", ".xlsm"),
    APPLICATION_VND_MS_EXCEL_TEMPLATE_MACROENABLED_12("application/vnd.ms-excel.template.macroEnabled.12", ".xltm"),
    APPLICATION_VND_MS_MEDIAPACKAGE("application/vnd.ms-mediapackage", ".mpf"),
    APPLICATION_VND_MS_OFFICETHEME("application/vnd.ms-officetheme", ".thmx"),
    APPLICATION_VND_MS_OFFICE_CALX("application/vnd.ms-office.calx", ".calx"),
    APPLICATION_VND_MS_PKI_CERTSTORE("application/vnd.ms-pki.certstore", ".sst"),
    APPLICATION_VND_MS_PKI_PKO("application/vnd.ms-pki.pko", ".pko"),
    APPLICATION_VND_MS_PKI_SECCAT("application/vnd.ms-pki.seccat", ".cat"),
    APPLICATION_VND_MS_PKI_STL("application/vnd.ms-pki.stl", ".stl"),
    APPLICATION_VND_MS_POWERPOINT("application/vnd.ms-powerpoint", ".pot", ".ppa", ".pps", ".ppt", ".pwz"),
    APPLICATION_VND_MS_POWERPOINT_ADDIN_MACROENABLED_12("application/vnd.ms-powerpoint.addin.macroEnabled.12", ".ppam"),
    APPLICATION_VND_MS_POWERPOINT_PRESENTATION_MACROENABLED_12("application/vnd.ms-powerpoint.presentation.macroEnabled.12", ".pptm"),
    APPLICATION_VND_MS_POWERPOINT_SLIDESHOW_MACROENABLED_12("application/vnd.ms-powerpoint.slideshow.macroEnabled.12", ".ppsm"),
    APPLICATION_VND_MS_POWERPOINT_SLIDE_MACROENABLED_12("application/vnd.ms-powerpoint.slide.macroEnabled.12", ".sldm"),
    APPLICATION_VND_MS_POWERPOINT_TEMPLATE_MACROENABLED_12("application/vnd.ms-powerpoint.template.macroEnabled.12", ".potm"),
    APPLICATION_VND_MS_PROJECT("application/vnd.ms-project", ".mpp"),
    APPLICATION_VND_MS_VISIO_VIEWER("application/vnd.ms-visio.viewer", ".vdx"),
    APPLICATION_VND_MS_WORD_DOCUMENT_MACROENABLED_12("application/vnd.ms-word.document.macroEnabled.12", ".docm"),
    APPLICATION_VND_MS_WORD_TEMPLATE_MACROENABLED_12("application/vnd.ms-word.template.macroEnabled.12", ".dotm"),
    APPLICATION_VND_MS_WORKS("application/vnd.ms-works", ".wcm", ".wdb", ".wks", ".wps"),
    APPLICATION_VND_MS_WPL("application/vnd.ms-wpl", ".wpl"),
    APPLICATION_VND_MS_XPSDOCUMENT("application/vnd.ms-xpsdocument", ".xps"),
    APPLICATION_VND_OASIS_OPENDOCUMENT_PRESENTATION("application/vnd.oasis.opendocument.presentation", ".odp"),
    APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT("application/vnd.oasis.opendocument.text", ".odt"),
    APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_PRESENTATION("application/vnd.openxmlformats-officedocument.presentationml.presentation", ".pptx"),
    APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_SLIDE("application/vnd.openxmlformats-officedocument.presentationml.slide", ".sldx"),
    APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_SLIDESHOW("application/vnd.openxmlformats-officedocument.presentationml.slideshow", ".ppsx"),
    APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_PRESENTATIONML_TEMPLATE("application/vnd.openxmlformats-officedocument.presentationml.template", ".potx"),
    APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", ".xlsx"),
    APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_TEMPLATE("application/vnd.openxmlformats-officedocument.spreadsheetml.template", ".xltx"),
    APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT("application/vnd.openxmlformats-officedocument.wordprocessingml.document", ".docx"),
    APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_TEMPLATE("application/vnd.openxmlformats-officedocument.wordprocessingml.template", ".dotx"),
    APPLICATION_VND_RN_REALMEDIA("application/vnd.rn-realmedia", ".rm"),
    APPLICATION_VND_RN_RN_MUSIC_PACKAGE("application/vnd.rn-rn_music_package", ".rmp"),
    APPLICATION_VND_VISIO("application/vnd.visio", ".vsd", ".vss", ".vst", ".vsw", ".vsx", ".vtx"),
    APPLICATION_VND_WAP_WMLC("application/vnd.wap.wmlc", ".wmlc"),
    APPLICATION_VND_WAP_WMLSCRIPTC("application/vnd.wap.wmlscriptc", ".wmlsc"),
    APPLICATION_VSIX("application/vsix", ".vsix"),
    APPLICATION_WINDOWS_LIBRARY_XML("application/windows-library+xml", ".library-ms"),
    APPLICATION_WINDOWS_SEARCH_CONNECTOR_XML("application/windows-search-connector+xml", ".searchConnector-ms"),
    APPLICATION_WINHLP("application/winhlp", ".hlp"),
    APPLICATION_WLMOVIEMAKER("application/wlmoviemaker", ".WLMP"),
    APPLICATION_XAML_XML("application/xaml+xml", ".xaml"),
    APPLICATION_XHTML_XML("application/xhtml+xml", ".xht", ".xhtml"),
    APPLICATION_XML("application/xml", ".asa", ".asax", ".ascx", ".ashx", ".asmx", ".aspx", ".config", ".coverage", ".datasource", ".filters", ".dgml", ".generictest", ".hxa", ".hxc", ".hxe", ".hxf", ".hxk", ".hxv", ".loadtest", ".master", ".mtx", ".orderedtest", ".psess", ".rdlc", ".resx", ".ruleset", ".settings", ".sitemap", ".skin", ".snippet", ".svc", ".testrunconfig", ".testsettings", ".trx", ".vcproj", ".vcxproj", ".vscontent", ".vsmdi", ".webtest", ".wiq", ".xmta", ".xsc", ".xss"),
    APPLICATION_X_7Z_COMPRESSED("application/x-7z-compressed", ".7z"),
    APPLICATION_X_BCPIO("application/x-bcpio", ".bcpio"),
    APPLICATION_X_BRIDGE_URL("application/x-bridge-url", ".adobebridge"),
    APPLICATION_X_CDF("application/x-cdf", ".cdf"),
    APPLICATION_X_COMPRESS("application/x-compress", ".z"),
    APPLICATION_X_COMPRESSED("application/x-compressed", ".tgz"),
    APPLICATION_X_CPIO("application/x-cpio", ".cpio"),
    APPLICATION_X_CSH("application/x-csh", ".csh"),
    APPLICATION_X_DIRECTOR("application/x-director", ".dcr", ".dir", ".dxr"),
    APPLICATION_X_DVI("application/x-dvi", ".dvi"),
    APPLICATION_X_GTAR("application/x-gtar", ".gtar"),
    APPLICATION_X_GZIP("application/x-gzip", ".gz"),
    APPLICATION_X_HDF("application/x-hdf", ".hdf"),
    APPLICATION_X_INTERNET_SIGNUP("application/x-internet-signup", ".ins", ".isp"),
    APPLICATION_X_IPHONE("application/x-iphone", ".iii"),
    APPLICATION_X_ITUNES_IPA("application/x-itunes-ipa", ".ipa"),
    APPLICATION_X_ITUNES_IPG("application/x-itunes-ipg", ".ipg"),
    APPLICATION_X_ITUNES_IPSW("application/x-itunes-ipsw", ".ipsw"),
    APPLICATION_X_ITUNES_ITE("application/x-itunes-ite", ".ite"),
    APPLICATION_X_ITUNES_ITLP("application/x-itunes-itlp", ".itlp"),
    APPLICATION_X_ITUNES_ITMS("application/x-itunes-itms", ".itms"),
    APPLICATION_X_ITUNES_ITPC("application/x-itunes-itpc", ".itpc"),
    APPLICATION_X_JAVASCRIPT("application/x-javascript", ".js"),
    APPLICATION_X_JAVA_APPLET("application/x-java-applet", ".class"),
    APPLICATION_X_JAVA_JNLP_FILE("application/x-java-jnlp-file", ".jnlp"),
    APPLICATION_X_LATEX("application/x-latex", ".latex"),
    APPLICATION_X_MIVA_COMPILED("application/x-miva-compiled", ".mvc"),
    APPLICATION_X_MMXP("application/x-mmxp", ".mxp"),
    APPLICATION_X_MPEG("application/x-mpeg", ".amc"),
    APPLICATION_X_MSACCESS("application/x-msaccess", ".mdb"),
    APPLICATION_X_MSCARDFILE("application/x-mscardfile", ".crd"),
    APPLICATION_X_MSCLIP("application/x-msclip", ".clp"),
    APPLICATION_X_MSDOWNLOAD("application/x-msdownload", ".dll"),
    APPLICATION_X_MSMEDIAVIEW("application/x-msmediaview", ".m13", ".m14", ".mvb"),
    APPLICATION_X_MSMETAFILE("application/x-msmetafile", ".wmf"),
    APPLICATION_X_MSMONEY("application/x-msmoney", ".mny"),
    APPLICATION_X_MSPUBLISHER("application/x-mspublisher", ".pub"),
    APPLICATION_X_MSSCHEDULE("application/x-msschedule", ".scd"),
    APPLICATION_X_MSTERMINAL("application/x-msterminal", ".trm"),
    APPLICATION_X_MSWRITE("application/x-mswrite", ".wri"),
    APPLICATION_X_MS_APPLICATION("application/x-ms-application", ".application"),
    APPLICATION_X_MS_LICENSE("application/x-ms-license", ".slupkg-ms"),
    APPLICATION_X_MS_MANIFEST("application/x-ms-manifest", ".manifest"),
    APPLICATION_X_MS_READER("application/x-ms-reader", ".lit"),
    APPLICATION_X_MS_VSTO("application/x-ms-vsto", ".vsto"),
    APPLICATION_X_MS_WMD("application/x-ms-wmd", ".wmd"),
    APPLICATION_X_MS_WMZ("application/x-ms-wmz", ".wmz"),
    APPLICATION_X_MS_XBAP("application/x-ms-xbap", ".xbap"),
    APPLICATION_X_NETCDF("application/x-netcdf", ".nc"),
    APPLICATION_X_OLEOBJECT("application/x-oleobject", ".hhc"),
    APPLICATION_X_PERFMON("application/x-perfmon", ".pma", ".pmc", ".pml", ".pmr", ".pmw"),
    APPLICATION_X_PKCS12("application/x-pkcs12", ".p12", ".pfx"),
    APPLICATION_X_PKCS7_CERTIFICATES("application/x-pkcs7-certificates", ".p7b", ".spc"),
    APPLICATION_X_PKCS7_CERTREQRESP("application/x-pkcs7-certreqresp", ".p7r"),
    APPLICATION_X_PODCAST("application/x-podcast", ".pcast"),
    APPLICATION_X_QUICKTIMEPLAYER("application/x-quicktimeplayer", ".qtl"),
    APPLICATION_X_SAFARI_SAFARIEXTZ("application/x-safari-safariextz", ".safariextz"),
    APPLICATION_X_SAFARI_WEBARCHIVE("application/x-safari-webarchive", ".webarchive"),
    APPLICATION_X_SGIMB("application/x-sgimb", ".sgimb"),
    APPLICATION_X_SH("application/x-sh", ".sh"),
    APPLICATION_X_SHAR("application/x-shar", ".shar"),
    APPLICATION_X_SHOCKWAVE_FLASH("application/x-shockwave-flash", ".mfp", ".swf"),
    APPLICATION_X_SILVERLIGHT_APP("application/x-silverlight-app", ".xap"),
    APPLICATION_X_SMAF("application/x-smaf", ".mmf"),
    APPLICATION_X_STUFFIT("application/x-stuffit", ".sit"),
    APPLICATION_X_SV4CPIO("application/x-sv4cpio", ".sv4cpio"),
    APPLICATION_X_SV4CRC("application/x-sv4crc", ".sv4crc"),
    APPLICATION_X_TAR("application/x-tar", ".tar"),
    APPLICATION_X_TCL("application/x-tcl", ".tcl"),
    APPLICATION_X_TEX("application/x-tex", ".tex"),
    APPLICATION_X_TEXINFO("application/x-texinfo", ".texi", ".texinfo"),
    APPLICATION_X_TROFF("application/x-troff", ".roff", ".t", ".tr"),
    APPLICATION_X_TROFF_MAN("application/x-troff-man", ".man"),
    APPLICATION_X_TROFF_ME("application/x-troff-me", ".me"),
    APPLICATION_X_TROFF_MS("application/x-troff-ms", ".ms"),
    APPLICATION_X_USTAR("application/x-ustar", ".ustar"),
    APPLICATION_X_WAIS_SOURCE("application/x-wais-source", ".src"),
    APPLICATION_X_WLPG3_DETECT("application/x-wlpg3-detect", ".wlpginstall3"),
    APPLICATION_X_WLPG_DETECT("application/x-wlpg-detect", ".wlpginstall"),
    APPLICATION_X_X509_CA_CERT("application/x-x509-ca-cert", ".cer", ".crt", ".der"),
    APPLICATION_X_ZIP_COMPRESSED("application/x-zip-compressed", ".zip"),
    AUDIO_AAC("audio/aac", ".AAC", ".ADTS"),
    AUDIO_AC3("audio/ac3", ".ac3"),
    AUDIO_AIFF("audio/aiff", ".aifc", ".aiff", ".cdda"),
    AUDIO_AUDIBLE("audio/audible", ".aa"),
    AUDIO_BASIC("audio/basic", ".au", ".snd"),
    AUDIO_M4A("audio/m4a", ".m4a"),
    AUDIO_M4B("audio/m4b", ".m4b"),
    AUDIO_M4P("audio/m4p", ".m4p"),
    AUDIO_MID("audio/mid", ".mid", ".midi", ".rmi"),
    AUDIO_MPEG("audio/mpeg", ".mp3"),
    AUDIO_SCPLS("audio/scpls", ".pls"),
    AUDIO_VND_AUDIBLE_AAX("audio/vnd.audible.aax", ".aax"),
    AUDIO_VND_DLNA_ADTS("audio/vnd.dlna.adts", ".ADT"),
    AUDIO_WAV("audio/wav", ".wav", ".wave"),
    AUDIO_X_AIFF("audio/x-aiff", ".aif"),
    AUDIO_X_CAF("audio/x-caf", ".caf"),
    AUDIO_X_GSM("audio/x-gsm", ".gsm"),
    AUDIO_X_M4R("audio/x-m4r", ".m4r"),
    AUDIO_X_MPEGURL("audio/x-mpegurl", ".m3u", ".m3u8"),
    AUDIO_X_MS_WAX("audio/x-ms-wax", ".wax"),
    AUDIO_X_MS_WMA("audio/x-ms-wma", ".wma"),
    AUDIO_X_PN_REALAUDIO("audio/x-pn-realaudio", ".ra", ".ram"),
    AUDIO_X_PN_REALAUDIO_PLUGIN("audio/x-pn-realaudio-plugin", ".rpm"),
    AUDIO_X_SD2("audio/x-sd2", ".sd2"),
    AUDIO_X_SMD("audio/x-smd", ".smd", ".smx", ".smz"),
    DRAWING_X_DWF("drawing/x-dwf", ".dwf"),
    IMAGE_BMP("image/bmp", ".bmp", ".dib"),
    IMAGE_CIS_COD("image/cis-cod", ".cod"),
    IMAGE_GIF("image/gif", ".gif"),
    IMAGE_IEF("image/ief", ".ief"),
    IMAGE_JPEG("image/jpeg", ".jpe", ".jpeg", ".jpg"),
    IMAGE_PICT("image/pict", ".pct", ".pic", ".pict"),
    IMAGE_PJPEG("image/pjpeg", ".jfif"),
    IMAGE_PNG("image/png", ".png", ".pnz"),
    IMAGE_TIFF("image/tiff", ".tif", ".tiff"),
    IMAGE_VND_MS_PHOTO("image/vnd.ms-photo", ".wdp"),
    IMAGE_VND_RN_REALFLASH("image/vnd.rn-realflash", ".rf"),
    IMAGE_VND_WAP_WBMP("image/vnd.wap.wbmp", ".wbmp"),
    IMAGE_X_CMU_RASTER("image/x-cmu-raster", ".ras"),
    IMAGE_X_CMX("image/x-cmx", ".cmx"),
    IMAGE_X_ICON("image/x-icon", ".ico"),
    IMAGE_X_JG("image/x-jg", ".art"),
    IMAGE_X_MACPAINT("image/x-macpaint", ".mac", ".pnt", ".pntg"),
    IMAGE_X_PORTABLE_ANYMAP("image/x-portable-anymap", ".pnm"),
    IMAGE_X_PORTABLE_BITMAP("image/x-portable-bitmap", ".pbm"),
    IMAGE_X_PORTABLE_GRAYMAP("image/x-portable-graymap", ".pgm"),
    IMAGE_X_PORTABLE_PIXMAP("image/x-portable-pixmap", ".ppm"),
    IMAGE_X_QUICKTIME("image/x-quicktime", ".qti", ".qtif"),
    IMAGE_X_RGB("image/x-rgb", ".rgb"),
    IMAGE_X_XBITMAP("image/x-xbitmap", ".xbm"),
    IMAGE_X_XPIXMAP("image/x-xpixmap", ".xpm"),
    IMAGE_X_XWINDOWDUMP("image/x-xwindowdump", ".xwd"),
    MESSAGE_RFC822("message/rfc822", ".eml", ".mht", ".mhtml", ".nws"),
    TEXT_CSS("text/css", ".css"),
    TEXT_CSV("text/csv", ".csv"),
    TEXT_DLM("text/dlm", ".dlm"),
    TEXT_H323("text/h323", ".323"),
    TEXT_HTML("text/html", ".htm", ".html", ".hxt", ".shtml"),
    TEXT_IULS("text/iuls", ".uls"),
    TEXT_JSCRIPT("text/jscript", ".jsx"),
    TEXT_PLAIN("text/plain", ".asm", ".bas", ".c", ".cc", ".cd", ".cnf", ".cpp", ".cs", ".csdproj", ".csproj", ".cxx", ".dbproj", ".def", ".dsw", ".h", ".hpp", ".hxx", ".i", ".idl", ".inc", ".inl", ".ipproj", ".jsxbin", ".lst", ".mak", ".map", ".mk", ".odh", ".odl", ".pkgdef", ".pkgundef", ".rc", ".rc2", ".rct", ".rgs", ".s", ".sln", ".sol", ".sor", ".srf", ".tlh", ".tli", ".txt", ".user", ".vb", ".vbdproj", ".vbproj", ".vcs", ".vddproj", ".vdp", ".vdproj", ".vspscc", ".vsscc", ".vssscc", ".xdr", ".XOML"),
    TEXT_RICHTEXT("text/richtext", ".rtx"),
    TEXT_SCRIPTLET("text/scriptlet", ".sct", ".wsc"),
    TEXT_SGML("text/sgml", ".sgml"),
    TEXT_TAB_SEPARATED_VALUES("text/tab-separated-values", ".tsv"),
    TEXT_VBSCRIPT("text/vbscript", ".vbs"),
    TEXT_VND_WAP_WML("text/vnd.wap.wml", ".wml"),
    TEXT_VND_WAP_WMLSCRIPT("text/vnd.wap.wmlscript", ".wmls"),
    TEXT_WEBVIEWHTML("text/webviewhtml", ".htt"),
    TEXT_XML("text/xml", ".AddIn", ".disco", ".dll.config", ".dtd", ".dtsConfig", ".exe.config", ".mno", ".SSISDeploymentManifest", ".vml", ".vsct", ".vsixlangpack", ".vsixmanifest", ".vssettings", ".vstemplate", ".wsdl", ".xml", ".xrm-ms", ".xsd", ".xsf", ".xsl", ".xslt"),
    TEXT_X_COMPONENT("text/x-component", ".htc"),
    TEXT_X_HDML("text/x-hdml", ".hdml"),
    TEXT_X_HTML_INSERTION("text/x-html-insertion", ".qht", ".qhtm"),
    TEXT_X_MS_CONTACT("text/x-ms-contact", ".contact"),
    TEXT_X_MS_GROUP("text/x-ms-group", ".group"),
    TEXT_X_MS_IQY("text/x-ms-iqy", ".iqy"),
    TEXT_X_MS_ODC("text/x-ms-odc", ".odc"),
    TEXT_X_MS_RQY("text/x-ms-rqy", ".rqy"),
    TEXT_X_SETEXT("text/x-setext", ".etx"),
    TEXT_X_VCARD("text/x-vcard", ".vcf"),
    VIDEO_3GPP("video/3gpp", ".3gp", ".3gpp"),
    VIDEO_3GPP2("video/3gpp2", ".3g2", ".3gp2"),
    VIDEO_MP4("video/mp4", ".mp4", ".mp4v"),
    VIDEO_MPEG("video/mpeg", ".m1v", ".m2v", ".mod", ".mp2", ".mp2v", ".mpa", ".mpe", ".mpeg", ".mpg", ".mpv2", ".vbk"),
    VIDEO_QUICKTIME("video/quicktime", ".mov", ".mqv", ".qt"),
    VIDEO_VND_DLNA_MPEG_TTS("video/vnd.dlna.mpeg-tts", ".m2t", ".m2ts", ".mts", ".ts", ".tts"),
    VIDEO_X_DV("video/x-dv", ".dif", ".dv"),
    VIDEO_X_FLV("video/x-flv", ".flv"),
    VIDEO_X_IVF("video/x-ivf", ".IVF"),
    VIDEO_X_LA_ASF("video/x-la-asf", ".lsf", ".lsx"),
    VIDEO_X_M4V("video/x-m4v", ".m4v"),
    VIDEO_X_MSVIDEO("video/x-msvideo", ".avi"),
    VIDEO_X_MS_ASF("video/x-ms-asf", ".asf", ".asr", ".asx", ".nsc"),
    VIDEO_X_MS_WM("video/x-ms-wm", ".wm"),
    VIDEO_X_MS_WMP("video/x-ms-wmp", ".wmp"),
    VIDEO_X_MS_WMV("video/x-ms-wmv", ".wmv"),
    VIDEO_X_MS_WMX("video/x-ms-wmx", ".wmx"),
    VIDEO_X_MS_WVX("video/x-ms-wvx", ".wvx"),
    VIDEO_X_SGI_MOVIE("video/x-sgi-movie", ".movie"),
    X_WORLD_X_VRML("x-world/x-vrml", ".flr", ".wrl", ".wrz", ".xaf", ".xof");


    private final static Map<String, MimeMediaType> EXTENSION_TO_MIME = new HashMap<>();

    static {
        for (final var type : MimeMediaType.values()) {
            for (final var extension : type.extensions()) {
                EXTENSION_TO_MIME.put(extension, type);
            }
        }
    }

    public static MimeMediaType fromTypeExtension(final String extension) {
        return EXTENSION_TO_MIME.get(extension.charAt(0) != '.' ? "." + extension : extension);
    }

    @Getter
    @Accessors(fluent = true)
    private final String mime;

    @Getter
    @Accessors(fluent = true)
    private final String[] extensions;

    MimeMediaType(final String mime, final String... extensions) {
        this.mime = mime;
        this.extensions = extensions;
    }
}

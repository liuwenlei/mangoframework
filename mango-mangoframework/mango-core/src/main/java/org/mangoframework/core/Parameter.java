package org.mangoframework.core;

import org.apache.commons.fileupload.FileItem;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 参数
 * Created by zhoujingjie on 2016/2/23.
 */
public class Parameter {

    //请求的相对地址
    private String path;
    //请求的地址
    private String requestURL;
    //后缀
    private String extension;
    //方法
    private String method;
    //
    private String contextPath;
    //字符串参数
    private Map<String,String> paramString = new HashMap<>();
    //文件参数
    private Map<String,List<FileItem>> paramFile = new HashMap<>();

    private HttpServletRequest request;


    public Map<String, String> getParamString() {
        return paramString;
    }

    public void setParamString(Map<String, String> paramString) {
        this.paramString = paramString;
    }

    public Map<String, List<FileItem>> getParamFile() {
        return paramFile;
    }

    public void setParamFile(Map<String, List<FileItem>> paramFile) {
        this.paramFile = paramFile;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRequestURL() {
        return requestURL;
    }

    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
        this.contextPath = request.getServletContext().getContextPath();
    }

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }
}

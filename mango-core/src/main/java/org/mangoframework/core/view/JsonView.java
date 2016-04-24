package org.mangoframework.core.view;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.mangoframework.core.dispatcher.Parameter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * dependency: com.alibaba.fastjson
 * @author : zhoujingjie
 * @Date: 16/4/22
 */
public class JsonView extends ResultView {
    @Override
    public void doRepresent(Parameter parameter) throws IOException ,ServletException{
        HttpServletResponse response = parameter.getResponse();
        response.setContentType("application/json");
        JSON.writeJSONStringTo(super.getData(),response.getWriter(), SerializerFeature.WriteDateUseDateFormat);
    }
}

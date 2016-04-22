package org.mangoframework.core;

import org.mangoframework.core.exception.MangoException;
import org.mangoframework.core.view.ResultView;

/**
 * @author zhoujingjie
 * @date 2016/4/22
 */
public interface HandlerAdapter {

    ResultView handle(Parameter parameter) throws MangoException;

}

package person.example.designpatterns.example3.impl;

import java.lang.reflect.Method;

/**
 * @author: 卢海鹏
 * @create: 2021-03-04 10:39
 * @description: 保存了调用某个对象的某个方法进行通知，标准的观察者只能基于接口方法通知。
 */
public class Event {
    private Object object;
    private String methodName;
    private Object[] params;
    private Class[] paramsTypes;

    public Event(Object object, String methodName, Object... args) {
        this.object = object;
        this.methodName = methodName;
        this.params = args;
        analysisParamsTypes(this.params);
    }

    private void analysisParamsTypes(Object[] params) {
        this.paramsTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramsTypes[i] = params[i].getClass();
        }
    }

    public void invoke() throws Exception {
        Method method = object.getClass().getMethod(this.methodName, this.paramsTypes);
        if (method == null) {
            return;
        }
        method.invoke(this.object, this.params);
    }
}

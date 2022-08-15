package cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Project name(项目名称)：java设计模式_代理模式
 * Package(包名): cglib_proxy
 * Class(类名): ProxyFactory
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/15
 * Time(创建时间)： 20:34
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class ProxyFactory implements MethodInterceptor
{

    private final TrainStation trainStation = new TrainStation();

    /**
     * @param o           代理对象
     * @param method      真实对象中的方法的Method实例
     * @param objects     实际参数
     * @param methodProxy 代理对象中的方法的method实例
     * @return TrainStation对象
     * @throws Throwable Throwable
     */
    @Override
    public TrainStation intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable
    {
        System.out.println("代理点收取一些服务费用");
        Object result = methodProxy.invokeSuper(o, objects);
        return (TrainStation) result;
    }

    /**
     * 获得代理对象
     *
     * @return TrainStation对象
     */
    public TrainStation getProxyObject()
    {
        //创建Enhancer对象
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(trainStation.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        Object o = enhancer.create();
        return (TrainStation) o;
    }
}

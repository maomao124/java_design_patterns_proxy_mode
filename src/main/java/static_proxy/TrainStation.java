package static_proxy;

/**
 * Project name(项目名称)：java设计模式_代理模式
 * Package(包名): static_proxy
 * Class(类名): TrainStation
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/14
 * Time(创建时间)： 22:01
 * Version(版本): 1.0
 * Description(描述)： 火车站  火车站具有卖票功能
 */

public class TrainStation implements SellTickets
{

    @Override
    public void sell()
    {
        System.out.println("火车站卖票");
    }
}

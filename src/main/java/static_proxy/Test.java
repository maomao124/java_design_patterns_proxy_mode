package static_proxy;

/**
 * Project name(项目名称)：java设计模式_代理模式
 * Package(包名): static_proxy
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/14
 * Time(创建时间)： 22:04
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        SellTickets sellTickets = new ProxyPoint();
        sellTickets.sell();
    }
}

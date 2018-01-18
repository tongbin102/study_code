package com.tb.lombok;

import lombok.Data;
import lombok.NonNull;

/**
 * lombok,减少冗长代码，使POJO更简洁
 *
 * @NonNull ： 使用 @NonNull 注解修饰的字段 通过 set 方法设置时如果为 null, 将抛出 NullPointerException
 * @Cleanup ： 主要用来修饰 IO 流相关类, 会在 finally 代码块中对该资源进行 close();
 * @Getter,@Setter ： 为字段生成 getter,setter 方法, 标记到类上表明为所有字段生成
 * @ToString ： 生成 toString 方法, 默认打印所有非静态字段
 * @EqualsAndHashCode ： 生成 equals 和 hashCode 方法
 * @NoArgsConstructor ： 无参构造函数
 * @RequiredArgsConstructor ： 为未初始化的 final 字段和使用 @NonNull 标注的字段生成构造函数
 * @AllArgsConstructor ： 为所有字段生成构造函数
 * @Data ： 相当于同时使@Getter,@Setter,@ToString,@EqualsAndHashCode,@RequiredArgsConstructor
 * @Value ： 类将使用 final 进行修饰,同时使用@ToString,@EqualsAndHashCode,@AllArgsConstructor,@Getter
 * @Builder ： 创建一个静态内部类, 使用该类可以使用链式调用创建对象
 * 如 User 对象中存在 name,age 字段, User user=User.builder().name(“姓名”).age(20).build()
 * @SneakyThrows ： 对标注的方法进行 try catch 后抛出异常, 可在 value 输入需要 catch 的异常数组, 默认 catch Throwable
 * @Synchronized ： 在标注的方法内 使用 synchronized(\$lock) {} 对代码进行包裹 ,$lock 为 new Object[0]
 * @Log,@CommonsLog,@JBossLog,@Log,@Log4j,@Log4j2,@Slf4j,@XSlf4j ： 生成一个当前类的日志对象, 可以使用 topic 指定要获取的日志名称,使用log…使用
 * @Author tb
 * @Date 2018/1/18 13:33
 */
@Data
public class User {
    @NonNull
    private int id;

    private String name;
    private int age;
    private boolean flag;
}

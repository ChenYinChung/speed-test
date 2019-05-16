#!/usr/bin/env bash
# -XX:MetaspaceSize=128m （元空间默认大小）
# -XX:MaxMetaspaceSize=128m （元空间最大大小）
# -Xms6g （堆最大大小）
# -Xmx6g （堆默认大小）
# -Xmn256m （新生代大小）
# -Xss256k （棧最大深度大小）
# -XX:SurvivorRatio=8 （新生代分区比例 8:2）
# -XX:+UseConcMarkSweepGC （ 8g 以下指定使用的垃圾收集器，这里使用CMS GC ，若大於8g ,改為paralle GC ）
# -XX:+PrintGCDetails （打印详细的GC日志）
java -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=128m -Xms6g -Xmx6g -Xmn256m -Xss256k -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC -XX:+PrintGCDetails -jar speed-test.jar
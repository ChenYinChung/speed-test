#!/usr/bin/env bash

# -XX:MetaspaceSize=128m （元空间默认大小）
# -XX:MaxMetaspaceSize=128m （元空间最大大小）
# -Xms6g （堆最大大小）
# -Xmx6g （堆默认大小）
# -Xmn1g （新生代大小）
# -Xss1m （棧最大深度大小）
# -XX:SurvivorRatio=8 （新生代分区比例 8:2）
# -Xlog:gc*,gc+ref=info,gc+heap=info,gc+age=trace:file=payment-gc.log:tags,uptime,time,level:filecount=10,filesize=50m (G1GC for jdk11)
java -XX:MetaspaceSize=512m -XX:MaxMetaspaceSize=512m -Xms6g -Xmx6g -Xmn1g -Xss1m -XX:SurvivorRatio=8 \
 -Xlog:gc*,gc+ref=info,gc+heap=info,gc+age=trace:file=payment-gc.log:tags,uptime,time,level:filecount=10,filesize=50m \
 -jar speed-test.jar
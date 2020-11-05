##                                                     hbase笔记

### hbase的配置

hbase依赖于zookeeper和Hadoop因此在hbase配置上需要配置在hbase的conf的hbase-site.xml如下配置

```
<configuration>
        <property>  
                <name>hbase.rootdir</name>  
    <!--指定hbase的在hdfs的存储路径-->
                <value>hdfs://hadoop01:9000/HBase</value>  
        </property>

        <property>  
<!--允许集群启动-->
                <name>hbase.cluster.distributed</name>
                <value>true</value>
        </property>

   <!-- 0.98后的新变动，之前版本没有.port,默认端口为60000 -->
        <property>
                <name>hbase.master.port</name>
                <value>16000</value>
        </property>

        <property>  
                <name>hbase.zookeeper.quorum</name>
             <value>hadoop02:2181,hadoop03:2181,hadoop01:2181</value>
        </property>

        <property>  
                <name>hbase.zookeeper.property.dataDir</name>
<!--配置zookeeper的data文件目录-->
             <value> /export/servers/zookeeper-3.4.14/datas </value>
        </property>
</configuration>
```

在其habse的conf的hbase-env.sh 修改   其为false因为hbase自带了zookeeper

```
export HBASE_MANAGES_ZK=false

```

在修改其目录下的regionservers添加上主机名 如你的主机名分别为hadoop01,hadoop02,hadoop03则添加

非单机删除目录下的localhost

```
hadoop01
hadoop02
hadoop03
```

### hbase的启动和停止

```
#停止
. bin/stop-hbase.sh
#启动
. bin/start-hbase.sh

```

### hbase的shell操作

```
#配置路径 否则加 bin/hbase
hbase shell
#建表指定两个列族
create 't1', 'cf1', 'cf2'
#插入数据 put 表名 列 列族：列 值
put 't1' ,'r1' , 'cf1:name','jack'
#获取表名 指定的列
 get 't1', 'r1'
 #删除值 
delete 't1', 'r1', 'cf1:age'
#使用此命令可以查看所有版本的文件
scan  't1', {RAW =>true,VERSIONS => 10}

```


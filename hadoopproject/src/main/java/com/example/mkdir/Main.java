package com.example.mkdir;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    @Test
    public void testMkdirs() throws IOException, InterruptedException, URISyntaxException {

        // 1 获取文件系统
        Configuration configuration = new Configuration();
        // 配置在集群上运行
        // configuration.set("fs.defaultFS", "hdfs://hadoop102:9000");
        // FileSystem fs = FileSystem.get(configuration);

        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop102:9000"), configuration, "atguigu");

        // 2 创建目录
        fs.mkdirs(new Path("/1108/daxian/banzhang"));

        // 3 关闭资源
        fs.close();
    }
    @Test
    public void testCopyFromLocalFile() throws IOException, InterruptedException, URISyntaxException {
        // 1 获取文件系统
        Configuration configuration = new Configuration();
        configuration.set("dfs.replication", "2");
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop1001:9000"), configuration, "lin");

        // 2 上传文件
        fs.copyFromLocalFile(new Path("D:/BigData/ncdc/2009.txt"),new Path("/user/2009.txt"));
        //fs.copyFromLocalFile(new Path("D:/BigData/ncdc/2009.txt"),  );

        // 3 关闭资源
        fs.close();

        System.out.println("over");
    }
    @Test
    public void testRenameFileName() throws IOException, InterruptedException, URISyntaxException {
        // 1 获取文件系统
        Configuration configuration = new Configuration();
        configuration.set("dfs.replication", "2");
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop1001:9000"), configuration, "lin");
        fs.rename(new Path("/user/2009.txt"),new Path("/user/20090.txt"));


        fs.close();
        System.out.println("over");
    }

}


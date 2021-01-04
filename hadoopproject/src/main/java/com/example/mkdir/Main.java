package com.example.mkdir;


import org.apache.commons.httpclient.URIException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
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

        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop101:9000"), configuration, "lin");

        // 2 创建目录
        fs.mkdirs(new Path("/zhou"));

        // 3 关闭资源
        fs.close();
    }
    @Test
    public void testCopyFromLocalFile() throws IOException, InterruptedException, URISyntaxException {
        // 1 获取文件系统
        Configuration configuration = new Configuration();
        //设置副本数为2
        configuration.set("dfs.replication", "2");
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop101:9000"), configuration, "lin");

        // 2 上传文件
        fs.copyFromLocalFile(new Path("D:/BigData/ncdc/2010.txt"),new Path("/user/2010"));
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
    @Test
    public void readRight() throws IOException,InterruptedException, URISyntaxException{
        Configuration configuration = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop101:9000"), configuration, "lin");

        // 2 获取文件详情
        RemoteIterator<LocatedFileStatus> listFiles = fs.listFiles(new Path("/sun"), true);

        while(listFiles.hasNext()){
            LocatedFileStatus status = listFiles.next();

            // 输出详情
            // 文件名称 分组 长度 权限
            System.out.println(status.getPath().getName()+" "+ status.getGroup()+" "+status.getLen()+" "+status.getPermission());
            // 长度
           // System.out.println(status.getLen());
            // 权限
            //System.out.println(status.getPermission());
            // 分组
            //System.out.println(status.getGroup());

            // 获取存储的块信息
            BlockLocation[] blockLocations = status.getBlockLocations();

            for (BlockLocation blockLocation : blockLocations) {

                // 获取块存储的主机节点
                String[] hosts = blockLocation.getHosts();

                for (String host : hosts) {
                    System.out.print(host+" ");
                }
                System.out.println("");
            }


        }
// 3 关闭资源
        fs.close();

    }
    //判断文件夹和文件
    @Test
    public void testListStatus() throws IOException, InterruptedException, URISyntaxException{

        // 1 获取文件配置信息
        Configuration configuration = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://hadoop1001:9000"), configuration, "lin");

        // 2 判断是文件还是文件夹
        FileStatus[] listStatus = fs.listStatus(new Path("/"));

        for (FileStatus fileStatus : listStatus) {

            // 如果是文件
            if (fileStatus.isFile()) {
                System.out.println("f:"+fileStatus.getPath().getName());
            }else {
                System.out.println("d:"+fileStatus.getPath().getName());
            }
        }

        // 3 关闭资源
        fs.close();
    }

}


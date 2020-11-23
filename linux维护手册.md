```
sudo wget https://repo.huaweicloud.com/java/jdk/8u191-b12/jdk-8u191-linux-x64.tar.gz
```

```
sudo wget http://archive.apache.org/dist/hadoop/core/hadoop-2.7.2/hadoop-2.7.2-src.tar.gz
```

```
sudo yum install ntp ntpdate -y
date
```

```
sudo yum install openssh-server
ssh-keygen -t rsa
ssh-copy-id hadoop1001
```

```
sudo chown -R lin export/
```

```
yum -y install rsync

```

```
rsync -rvl hadoop-2.7.2/ hadoop101:/export/server/hadoop-2.7.2/
```

```
ipconfig/flushdns
```

```
sudo systemctl stop firewalld.service
sudo systemctl status  firewalld.service
#开机不启动
 sudo systemctl disable  firewalld.service
```

```
sudo vi /etc/sysconfig/network-scripts/ifcfg-ens33
sudo service network restart
uuidgen ens33
```

```
 sudo yum install ntp ntpdate -y
 date
 ntpdate 0.asia.pool.org
sudo  hwclock --systohc
```

[^]: hadoop1001为hdfs节点。hadoop1003为yarn节点 Hadoop004为历史节点


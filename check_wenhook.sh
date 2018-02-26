PATH=/usr/local/bin:/bin:/usr/bin:/usr/local/sbin:/usr/sbin:/sbin
. /etc/profile
export LANG=en_US.utf-8
exist=`ps aux | grep -w 'java -jar webhooks.jar'| grep -v 'grep' |  awk '{print $2}'`
if [ -z "$exist" ] ;
then
    echo 1
    nowtime=`date +"%Y-%m-%d %H:%M:%S"`
    echo $nowtime"webhooks.jar  can not find"
    cd /home/ubuntu/project/Webhooks/target
    nohup java -jar webhooks.jar &
fi

# 在crontab中添加  */3 * * * * sh /home/ubuntu/crontab/check_wenhook.sh >> /home/ubuntu/crontab/logs/check_wenhook.log &

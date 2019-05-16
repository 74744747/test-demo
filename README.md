数据库连不上  驱动版本太低
各个分支事务无法关联到全局事务  缺少依赖 seata-dubbo-alibaba
rpc filter  传递txid
数据源代理后 报找不到method 原因  druid数据源依赖版本太低  1.0.18升级到1.1.12
seata-server 启动时报错：seata-server.bat 启动脚本内 CLASSPATH 长度过长，可将同路径的jar以通配符拼接










AbstractDMLBaseExecutor.executeAutoCommitFalse 执行真正的数据库业务操作，并将操作之前和之后的数据快照保存到日志表


UpdateExecutor.beforeImage 查询更新前数据快照

UpdateExecutor.afterImage 查询更新后数据快照

在保存快照日志时，添加数据锁:当更新操作为delete时，那么更新之前的快照将被加锁。反之则为更新之后的快照加锁



全局回滚： seata-server  io.seata.server.coordinator.DefaultCore.doGlobalRollback(GlobalSession globalSession, boolean retrying)
/*
  注意:  在操作数据时,如果数据为varchar类型,该数据不要用双引号,要用单引号  
  
  原因:  将来我们不可能直接在mysql中写sql语句,我们都是将sql语句放到java代码中参与运行
         如果将sql语句放到java代码中,我们用java代码如何表示一条sql语句
         
         String sql = "INSERT INTO category (cid,cname) VALUES (1,"蔬菜");"有问题的代码
         
         String sql = "INSERT INTO category (cid,cname) VALUES (1,'蔬菜');"
*/
INSERT INTO category (cid,cname) VALUES (1,"蔬菜");

INSERT category (cid,cname) VALUES (2,'水果');-- into可以省略

INSERT INTO category (cid,cname) VALUES (3,'服装'),(4,'箱包'),(5,'电器');

INSERT INTO category VALUES (6,'家清');
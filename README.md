用了一晚上把MyBatis-Generator-GUI自动生成代码多模块项目弄了出来，其中要注意的是：在用界面生成器时，要注意选择Java实体类名的时候，要选择必要的定制列，去除不必要的列（软件自带），否则生成的代码容易报错，多是报：在xml里面有重复的方法名，只要把软件自带生成的不必要的字段方法去除即可。实体类也可以重新生成。

---
title: B_自定义校验
date: 2021-08-03 12:59:53
tags: 
categories: 
id: 1627966793715462900zdy 
---





 [IsMobile.java](demo\src\main\java\com\example\demo\validation\IsMobile.java) 



# 自定义校验  [IsMobile.java](demo\src\main\java\com\example\demo\validation\IsMobile.java) 

指定校验器

```java
@Constraint(validatedBy = {IsMobileValidator.class })
```

# 校验器 [IsMobileValidator.java](demo\src\main\java\com\example\demo\validation\IsMobileValidator.java) 

# 使用校验 [User.java](demo\src\main\java\com\example\demo\entity\User.java) 
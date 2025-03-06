package com.sist.vo;

import java.sql.Clob;

import lombok.Data;
/*
COCKTAIL_NO NOT NULL NUMBER        
ID                   VARCHAR2(20)  
NAME        NOT NULL VARCHAR2(360) 
ENAME       NOT NULL VARCHAR2(100) 
COMMENTS    NOT NULL VARCHAR2(600) 
ALC                  VARCHAR2(100) 
IMAGE       NOT NULL VARCHAR2(260) 
CONTENT     NOT NULL CLOB          
DETAIL               CHAR(1)       
HIT                  NUMBER        
LIKES                NUMBER        
*/
@Data
public class CocktailVO {
   private int hit,likes;
   private String id,name,ename,comments,alc,image;
   private Clob content;
}

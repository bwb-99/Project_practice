package com.sist.dao;
import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sist.vo.*;
import com.sist.commons.*;
public class CocktailDAO {
	private static SqlSessionFactory ssf;
	static
	{
		ssf=CreateSqlSessionFactory.getSsf();
	}
	/*
	 * <select id="cocktailMainHouseData" resultType="CocktailVO">
	  SELECT * FROM (SELECT * FORM cocktail
	    ORDER BY DBMS_RANDOM.RANDOM
	  )
	  WHERE rownum&lt;=1
	</select>
	<select id="cocktailMainHouseData8" resultType="CocktailVO">
	    SELECT * FROM (SELECT * FROM cocktail
	      ORDER BY DBMS_RANDOM.RANDOM
	    )
	    WHERE rownum&lt;=8
	  </select>
	</mapper>
	 */
	public static CocktailVO cocktailMainHouseData()
	{
		CocktailVO vo=null;
		SqlSession session=null;
		try
		{
			session=ssf.openSession();
			vo=session.selectOne("cocktailMainHouseData");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if(session!=null)
				 session.close();
		}
		return vo;
	}
	public static List<CocktailVO> cocktailMainHouseData8()
	{
		List<CocktailVO> list=null;
		SqlSession session=null;
		try 
		{
			session=ssf.openSession();
			list=session.selectList("cocktailMainHouseData8");
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if(session!=null)
				  session.close();
		}
		return list;
	}

}

package cn.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.pojo.User;

public interface UserMapper {
	public List<User> find();
	
	//使用注解方式sql
	@Select("select id,name,birthday,address from user where id=#{id}")
	public User get(@Param("id") Integer id);
	
	@Insert("insert into user(id,name,birthday,address)"
			+ " values(#{id},#{name},#{birthday},#{address})")
	public void insert(User user);
	
	@Update("update user set name=#{name},birthday=#{birthday},address=#{address} where id=#{id}")
	public void update(User user);
	
	@Delete("delete from user where id=#{id}")
	public void delete(@Param("id") Integer id);
}

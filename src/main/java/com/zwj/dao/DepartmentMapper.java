package com.zwj.dao;

import com.zwj.dao.dataobject.DepartmentDO;
import com.zwj.service.model.DepartmentVO;

import java.util.List;

/**
 * Created by 计国清 on 2019/05/12.
 */
public interface DepartmentMapper {
  List<DepartmentDO> findAll();

  void insert(DepartmentVO department);

  void update(DepartmentVO department);

  void deleteById(Integer id);

  List<DepartmentDO> findByName(String name);

  List<DepartmentDO> findByIds(List<Integer> ids);

  DepartmentDO isExist(DepartmentVO department);
}

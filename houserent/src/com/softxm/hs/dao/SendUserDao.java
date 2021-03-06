package com.softxm.hs.dao;

import com.softxm.hs.model.PageModel;
import com.softxm.hs.model.Tsenduser;

public interface SendUserDao {

	String saveSendUser(Tsenduser tsenduser);

	PageModel sendUserList(int currentPage, int pageSize, Tsenduser tsenduser);

	void sendUserPass(Tsenduser tsenduser);

	Tsenduser getSendUserOrder(Long suid);

	void deleteSendUserOrder(Long suid);

}

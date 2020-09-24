package org.cap.screenmanagement.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.cap.screenmanagement.dao.IScreenDao;
import org.cap.screenmanagement.entities.Screen;
import org.cap.screenmanagement.exception.ScreenNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ScreenServiceImpl implements IScreenService {

	private IScreenDao screenDao;

	public IScreenDao getScreenDao() {
		return screenDao;
	}

	@Autowired
	public void setScreenDao(IScreenDao screenDao) {
		this.screenDao = screenDao;
	}

	/*add new screen*/
	@Override
	public Screen addScreen(Screen screen) {
		screen = screenDao.save(screen);
		return screen;
	}

	/*delete new screen*/
	@Override
	public Boolean deleteScreen(int screenId) {
		Optional<Screen> optional = screenDao.findById(screenId);
		if (optional.isPresent()) {
			screenDao.deleteById(screenId);
			return true;
		}
		throw new ScreenNotFoundException("Screen not found for id=" + screenId);
	}

	/*view all screens*/
	@Override
	public List<Screen> viewAllScreens() {
		List<Screen> list = screenDao.findAll();
		return list;
	}

	/*view screen using screenid*/
	@Override
	public Screen viewScreen(int screenId) {
		Optional<Screen> optional = screenDao.findById(screenId);
		if (optional.isPresent()) {
			Screen screen = optional.get();
			return screen;
		}
		throw new ScreenNotFoundException("Screen not found for id=" + screenId);
	}

}

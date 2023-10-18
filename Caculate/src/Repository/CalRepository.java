/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import DataAccess.CalDao;

public class CalRepository implements ICalRepository {

    @Override
    public void calculate() {
        CalDao.Instance().display(
                CalDao.Instance().calculateRectangle(),
                CalDao.Instance().calculateCircle(),
                CalDao.Instance().calculateTriangle());
    }
}

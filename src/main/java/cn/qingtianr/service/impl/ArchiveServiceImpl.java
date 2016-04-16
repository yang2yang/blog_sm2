package main.java.cn.qingtianr.service.impl;

import main.java.cn.qingtianr.dao.ArchiveDao;
import main.java.cn.qingtianr.dbc.MybatisSqlSessionFactory;
import main.java.cn.qingtianr.model.Archive;
import main.java.cn.qingtianr.service.ArchiveService;

import java.util.ArrayList;

/**
 * Created by jack on 16-4-8.
 */
public class ArchiveServiceImpl implements ArchiveService {
    private ArchiveDao archivedao;

    @Override
    public ArrayList<Archive> getAllArchive() {
        ArrayList<Archive> archivelist = new ArrayList();
        archivelist = archivedao.getAllArchive();
        return archivelist;
    }

    public void setArchivedao(ArchiveDao archivedao) {
        this.archivedao = archivedao;
    }

    public ArchiveDao getArchivedao() {
        return archivedao;
    }
}

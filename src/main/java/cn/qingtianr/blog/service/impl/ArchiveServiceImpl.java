package cn.qingtianr.blog.service.impl;

import java.util.ArrayList;

import cn.qingtianr.blog.dao.ArchiveDao;
import cn.qingtianr.blog.model.Archive;
import cn.qingtianr.blog.service.ArchiveService;

/**
 * Created by jack on 16-4-8.
 */
public class ArchiveServiceImpl implements ArchiveService {
    private ArchiveDao archivedao;

    @Override
    public ArrayList<Archive> getAllArchive() {
        ArrayList<Archive> archivelist = archivelist = archivedao.getAllArchive();
        return archivelist;
    }

    public void setArchivedao(ArchiveDao archivedao) {
        this.archivedao = archivedao;
    }

    public ArchiveDao getArchivedao() {
        return archivedao;
    }
}

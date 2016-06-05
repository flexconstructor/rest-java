package ru.flexconstructor.ttt.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * Created by pk on 05.06.16.
 */
public class ServerLauncher extends HttpServlet {

    private static final Logger LOG = LoggerFactory.getLogger(ServerLauncher.class);
    public void init() throws ServletException {
        LOG.info("LAUNCH SERVER");
    }
}

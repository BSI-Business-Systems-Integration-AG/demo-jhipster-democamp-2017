package io.github.jhipster.demo.talkorganizer;

import java.util.UUID;

import org.eclipse.scout.boot.ui.scout.AbstractScoutBootClientSession;
import org.eclipse.scout.rt.client.session.ClientSessionProvider;
import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.platform.Bean;

@Bean
public class Session extends AbstractScoutBootClientSession {

  public static Session get() {
    return ClientSessionProvider.currentSession(Session.class);
  }

  @Override
  protected void execLoadSession() {
    setDesktop(BEANS.get(Desktop.class));
  }

  @Override
  public String getUserId() {
    return UUID.randomUUID().toString();
  }
}

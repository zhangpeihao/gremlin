package com.tinkerpop.gremlin.scala.filter

import com.tinkerpop.blueprints.pgm.impls.tg.TinkerGraphFactory
import com.tinkerpop.gremlin.test.ComplianceTest
import com.tinkerpop.gremlin.scala._

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */

class HasStepTest extends com.tinkerpop.gremlin.test.filter.HasStepTest {

  val g = TinkerGraphFactory.createTinkerGraph();

  override def testCompliance() {
    ComplianceTest.testCompliance(this.getClass)
  }

  def test_g_V_hasXname_markoX() {
    super.test_g_V_hasXname_markoX(g.V.has("name", "marko"));
  }

  def test_g_V_hasXname_blahX() {
    super.test_g_V_hasXname_blahX(g.V.has("name", "blah"));
  }

  def test_g_V_hasXblah_nullX() {
    super.test_g_V_hasXblah_nullX(g.V.has("blah", null));
  }
}

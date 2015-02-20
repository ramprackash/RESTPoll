package pollController

import org.springframework.boot.SpringApplication
import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RestController
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * Created by rmohan on 2/19/15.
 *
 * Controller part of the app
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
class MainController {
  @RequestMapping(value=Array("/moderators"), method=Array(RequestMethod.GET))
  def moderatorsGet() = {
    "Moderators to be dumped here"
  }

  @RequestMapping(value=Array("/moderators"), method=Array(RequestMethod.POST))
  def moderatorsCreate() = {
    "Moderators to be created here"
  }
}

object SpringWebApplication {
    def main (args: Array[String]): Unit = {
      SpringApplication.run(classOf[MainController])
  }
}

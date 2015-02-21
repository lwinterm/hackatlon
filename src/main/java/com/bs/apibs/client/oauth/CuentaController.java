package com.bs.apibs.client.oauth;

import java.io.IOException;
import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bs.apibs.client.model.Cuenta;
import com.bs.apibs.client.remote.ServicioOauthResponse;
import com.bs.apibs.client.utils.PropertiesUtil;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class CuentaController {
	@Autowired
	private ResourcesService resourcesService;
	@Autowired
	@Qualifier("aplicacionClienteProperties")
	private PropertiesUtil entorno;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(value = "/cuentas/posicionglobal")
	public ModelAndView getCuentasUsuario(@RequestParam(value = "version")
	String version,ModelMap map, HttpSession session, HttpServletRequest request, Principal principal) {
		String UrlPosicionGlobal = entorno.getProperty(PropertiesUtil.RUTA_SERVIDOR) + "/ResourcesServerBS/oauthservices/"+version+"/productos";

		String mov = resourcesService.getPosicionGlobalContent(UrlPosicionGlobal);

		ServicioOauthResponse<List<Cuenta>> json = null;

		ObjectMapper mapper = new ObjectMapper();

		try {
			json = mapper.readValue(mov, new TypeReference<ServicioOauthResponse<List<Cuenta>>>() {
				});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("cuentas", json);
		
		ModelAndView modelAndView = new ModelAndView("showCuentas", params);
		return modelAndView;
	}

	@RequestMapping(value = "/cuentas/cuentasvista")
	public ModelAndView getCuentasVistaUsuario(@RequestParam(value = "version")
	String version,ModelMap map, HttpSession session, HttpServletRequest request, Principal principal) {
		String UrlPosicionGlobal = entorno.getProperty(PropertiesUtil.RUTA_SERVIDOR) + "/ResourcesServerBS/oauthservices/"+version+"/cuentasvista/00810000000000000932/movimientos?fechaDesde=01-01-2014&fechaHasta=31-12-2014";

		String mov = resourcesService.getPosicionGlobalContent(UrlPosicionGlobal);

		ServicioOauthResponse<List<Cuenta>> json = null;

		ObjectMapper mapper = new ObjectMapper();

		try {
			json = mapper.readValue(mov, new TypeReference<ServicioOauthResponse<List<Cuenta>>>() {
				});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("cuentas", json);

		ModelAndView modelAndView = new ModelAndView("showCuentas", params);
		return modelAndView;
	}

	@RequestMapping(value = "/cuentas/tarjetas")
	public ModelAndView getTarjetasUsuario(@RequestParam(value = "version")
	String version,ModelMap map, HttpSession session, HttpServletRequest request, Principal principal) {
		String UrlPosicionGlobal = entorno.getProperty(PropertiesUtil.RUTA_SERVIDOR) + "/ResourcesServerBS/oauthservices/"+version+"/tarjetas/4106000000000004/movimientos?order=";

		String mov = resourcesService.getPosicionGlobalContent(UrlPosicionGlobal);

		ServicioOauthResponse<List<Cuenta>> json = null;

		ObjectMapper mapper = new ObjectMapper();

		try {
			json = mapper.readValue(mov, new TypeReference<ServicioOauthResponse<List<Cuenta>>>() {
				});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("cuentas", json);

		ModelAndView modelAndView = new ModelAndView("showCuentas", params);
		return modelAndView;
	}
}

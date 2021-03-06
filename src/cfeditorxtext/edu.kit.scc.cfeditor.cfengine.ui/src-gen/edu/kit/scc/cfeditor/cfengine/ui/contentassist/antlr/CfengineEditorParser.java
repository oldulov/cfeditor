/*
* generated by Xtext
*/
package edu.kit.scc.cfeditor.cfengine.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import edu.kit.scc.cfeditor.cfengine.services.CfengineEditorGrammarAccess;

public class CfengineEditorParser extends AbstractContentAssistParser {
	
	@Inject
	private CfengineEditorGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected edu.kit.scc.cfeditor.cfengine.ui.contentassist.antlr.internal.InternalCfengineEditorParser createParser() {
		edu.kit.scc.cfeditor.cfengine.ui.contentassist.antlr.internal.InternalCfengineEditorParser result = new edu.kit.scc.cfeditor.cfengine.ui.contentassist.antlr.internal.InternalCfengineEditorParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCLASS_IDAccess().getAlternatives(), "rule__CLASS_ID__Alternatives");
					put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
					put(grammarAccess.getPromiseValueAccess().getAlternatives_2(), "rule__PromiseValue__Alternatives_2");
					put(grammarAccess.getPromiseValueAccess().getAlternatives_2_0(), "rule__PromiseValue__Alternatives_2_0");
					put(grammarAccess.getPromiseValueAccess().getAlternatives_2_1_1(), "rule__PromiseValue__Alternatives_2_1_1");
					put(grammarAccess.getPromiseValueAccess().getAlternatives_2_1_2_1(), "rule__PromiseValue__Alternatives_2_1_2_1");
					put(grammarAccess.getBodyFunctionAccess().getAlternatives_2(), "rule__BodyFunction__Alternatives_2");
					put(grammarAccess.getSpecialFunctionAccess().getAlternatives_2(), "rule__SpecialFunction__Alternatives_2");
					put(grammarAccess.getCLASS_IDAccess().getGroup_0(), "rule__CLASS_ID__Group_0__0");
					put(grammarAccess.getCLASS_IDAccess().getGroup_0_1(), "rule__CLASS_ID__Group_0_1__0");
					put(grammarAccess.getCLASS_IDAccess().getGroup_1(), "rule__CLASS_ID__Group_1__0");
					put(grammarAccess.getCLASS_IDAccess().getGroup_2(), "rule__CLASS_ID__Group_2__0");
					put(grammarAccess.getCLASS_IDAccess().getGroup_2_3(), "rule__CLASS_ID__Group_2_3__0");
					put(grammarAccess.getBundleAccess().getGroup(), "rule__Bundle__Group__0");
					put(grammarAccess.getBundleAccess().getGroup_3(), "rule__Bundle__Group_3__0");
					put(grammarAccess.getBundleAccess().getGroup_3_2(), "rule__Bundle__Group_3_2__0");
					put(grammarAccess.getBundlePromiseTypeAccess().getGroup(), "rule__BundlePromiseType__Group__0");
					put(grammarAccess.getBundleClassAccess().getGroup(), "rule__BundleClass__Group__0");
					put(grammarAccess.getBundlePromiseAccess().getGroup(), "rule__BundlePromise__Group__0");
					put(grammarAccess.getBundlePromiseAccess().getGroup_1(), "rule__BundlePromise__Group_1__0");
					put(grammarAccess.getBundlePromiseAccess().getGroup_1_1(), "rule__BundlePromise__Group_1_1__0");
					put(grammarAccess.getPromiseValueAccess().getGroup(), "rule__PromiseValue__Group__0");
					put(grammarAccess.getPromiseValueAccess().getGroup_2_1(), "rule__PromiseValue__Group_2_1__0");
					put(grammarAccess.getPromiseValueAccess().getGroup_2_1_2(), "rule__PromiseValue__Group_2_1_2__0");
					put(grammarAccess.getPromiseValueAccess().getGroup_2_2(), "rule__PromiseValue__Group_2_2__0");
					put(grammarAccess.getBodyAccess().getGroup(), "rule__Body__Group__0");
					put(grammarAccess.getBodyAccess().getGroup_3(), "rule__Body__Group_3__0");
					put(grammarAccess.getBodyAccess().getGroup_3_2(), "rule__Body__Group_3_2__0");
					put(grammarAccess.getBodyClassAccess().getGroup(), "rule__BodyClass__Group__0");
					put(grammarAccess.getBodyFunctionAccess().getGroup(), "rule__BodyFunction__Group__0");
					put(grammarAccess.getBodyFunctionAccess().getGroup_2_1(), "rule__BodyFunction__Group_2_1__0");
					put(grammarAccess.getBodyFunctionAccess().getGroup_2_1_2(), "rule__BodyFunction__Group_2_1_2__0");
					put(grammarAccess.getBodyFunctionAccess().getGroup_2_3(), "rule__BodyFunction__Group_2_3__0");
					put(grammarAccess.getSimpleFunctionAccess().getGroup(), "rule__SimpleFunction__Group__0");
					put(grammarAccess.getSimpleFunctionAccess().getGroup_3(), "rule__SimpleFunction__Group_3__0");
					put(grammarAccess.getSpecialFunctionAccess().getGroup(), "rule__SpecialFunction__Group__0");
					put(grammarAccess.getSpecialFunctionAccess().getGroup_2_4(), "rule__SpecialFunction__Group_2_4__0");
					put(grammarAccess.getSpecialFunctionAccess().getGroup_2_5(), "rule__SpecialFunction__Group_2_5__0");
					put(grammarAccess.getCfModelAccess().getElementsAssignment(), "rule__CfModel__ElementsAssignment");
					put(grammarAccess.getBundleAccess().getComponentAssignment_1(), "rule__Bundle__ComponentAssignment_1");
					put(grammarAccess.getBundleAccess().getNameAssignment_2(), "rule__Bundle__NameAssignment_2");
					put(grammarAccess.getBundleAccess().getVariablesAssignment_3_1(), "rule__Bundle__VariablesAssignment_3_1");
					put(grammarAccess.getBundleAccess().getVariablesAssignment_3_2_1(), "rule__Bundle__VariablesAssignment_3_2_1");
					put(grammarAccess.getBundleAccess().getPromiseTypeAssignment_5(), "rule__Bundle__PromiseTypeAssignment_5");
					put(grammarAccess.getBundlePromiseTypeAccess().getNameAssignment_0(), "rule__BundlePromiseType__NameAssignment_0");
					put(grammarAccess.getBundlePromiseTypeAccess().getPromisesAssignment_2(), "rule__BundlePromiseType__PromisesAssignment_2");
					put(grammarAccess.getBundlePromiseTypeAccess().getClassesAssignment_3(), "rule__BundlePromiseType__ClassesAssignment_3");
					put(grammarAccess.getBundleClassAccess().getNameAssignment_0(), "rule__BundleClass__NameAssignment_0");
					put(grammarAccess.getBundleClassAccess().getPromisesAssignment_2(), "rule__BundleClass__PromisesAssignment_2");
					put(grammarAccess.getBundlePromiseAccess().getNameAssignment_0(), "rule__BundlePromise__NameAssignment_0");
					put(grammarAccess.getBundlePromiseAccess().getValuesAssignment_1_0(), "rule__BundlePromise__ValuesAssignment_1_0");
					put(grammarAccess.getBundlePromiseAccess().getValuesAssignment_1_1_1(), "rule__BundlePromise__ValuesAssignment_1_1_1");
					put(grammarAccess.getPromiseValueAccess().getKeywordAssignment_0(), "rule__PromiseValue__KeywordAssignment_0");
					put(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_0_0(), "rule__PromiseValue__ValuesAssignment_2_0_0");
					put(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_0_1(), "rule__PromiseValue__FunctionsAssignment_2_0_1");
					put(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_0_2(), "rule__PromiseValue__ValuesAssignment_2_0_2");
					put(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_1_0(), "rule__PromiseValue__ValuesAssignment_2_1_1_0");
					put(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_1_1_1(), "rule__PromiseValue__FunctionsAssignment_2_1_1_1");
					put(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_2_1_0(), "rule__PromiseValue__ValuesAssignment_2_1_2_1_0");
					put(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_1_2_1_1(), "rule__PromiseValue__FunctionsAssignment_2_1_2_1_1");
					put(grammarAccess.getBodyAccess().getComponentAssignment_1(), "rule__Body__ComponentAssignment_1");
					put(grammarAccess.getBodyAccess().getNameAssignment_2(), "rule__Body__NameAssignment_2");
					put(grammarAccess.getBodyAccess().getVariablesAssignment_3_1(), "rule__Body__VariablesAssignment_3_1");
					put(grammarAccess.getBodyAccess().getVariablesAssignment_3_2_1(), "rule__Body__VariablesAssignment_3_2_1");
					put(grammarAccess.getBodyAccess().getPromiseTypeAssignment_5(), "rule__Body__PromiseTypeAssignment_5");
					put(grammarAccess.getBodyAccess().getClassesAssignment_6(), "rule__Body__ClassesAssignment_6");
					put(grammarAccess.getBodyClassAccess().getNameAssignment_0(), "rule__BodyClass__NameAssignment_0");
					put(grammarAccess.getBodyClassAccess().getPromiseTypeAssignment_2(), "rule__BodyClass__PromiseTypeAssignment_2");
					put(grammarAccess.getBodyFunctionAccess().getNameAssignment_0(), "rule__BodyFunction__NameAssignment_0");
					put(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_0(), "rule__BodyFunction__ValuesAssignment_2_0");
					put(grammarAccess.getBodyFunctionAccess().getListAssignment_2_1_0(), "rule__BodyFunction__ListAssignment_2_1_0");
					put(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_1(), "rule__BodyFunction__ValuesAssignment_2_1_1");
					put(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_2_1(), "rule__BodyFunction__ValuesAssignment_2_1_2_1");
					put(grammarAccess.getBodyFunctionAccess().getFunctionAssignment_2_2(), "rule__BodyFunction__FunctionAssignment_2_2");
					put(grammarAccess.getSimpleFunctionAccess().getIdAssignment_0(), "rule__SimpleFunction__IdAssignment_0");
					put(grammarAccess.getSimpleFunctionAccess().getValuesAssignment_2(), "rule__SimpleFunction__ValuesAssignment_2");
					put(grammarAccess.getSimpleFunctionAccess().getValuesAssignment_3_1(), "rule__SimpleFunction__ValuesAssignment_3_1");
					put(grammarAccess.getSpecialFunctionAccess().getIdAssignment_0(), "rule__SpecialFunction__IdAssignment_0");
					put(grammarAccess.getSpecialFunctionAccess().getFuncAssignment_2_6(), "rule__SpecialFunction__FuncAssignment_2_6");
					put(grammarAccess.getBodyPromiseTypeAccess().getNameAssignment(), "rule__BodyPromiseType__NameAssignment");
					put(grammarAccess.getBundleComponentAccess().getNameAssignment(), "rule__BundleComponent__NameAssignment");
					put(grammarAccess.getBodyComponentAccess().getNameAssignment(), "rule__BodyComponent__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			edu.kit.scc.cfeditor.cfengine.ui.contentassist.antlr.internal.InternalCfengineEditorParser typedParser = (edu.kit.scc.cfeditor.cfengine.ui.contentassist.antlr.internal.InternalCfengineEditorParser) parser;
			typedParser.entryRuleCfModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}
	
	public CfengineEditorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CfengineEditorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
